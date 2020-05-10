package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsStrings.`jquery-extend-deep`
import typingsSlinky.lokijs.lokijsStrings.`parse-stringify`
import typingsSlinky.lokijs.lokijsStrings.`shallow-assign`
import typingsSlinky.lokijs.lokijsStrings.`shallow-recurse-objects`
import typingsSlinky.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionOptions[E] extends js.Object {
  var adaptiveBinaryIndices: Boolean = js.native
  var asyncListeners: Boolean = js.native
  var autoupdate: Boolean = js.native
  var cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` = js.native
  @JSName("clone")
  var clone_FCollectionOptions: Boolean = js.native
  var disableChangesApi: Boolean = js.native
  var disableDeltaChangesApi: Boolean = js.native
  var disableMeta: Boolean = js.native
  var exact: js.Array[/* keyof E */ String] = js.native
  var indices: (/* keyof E */ String) | (js.Array[/* keyof E */ String]) = js.native
  var serializableIndices: Boolean = js.native
  var transactional: Boolean = js.native
  var ttl: Double = js.native
  var ttlInterval: Double = js.native
  var unique: js.Array[/* keyof E */ String] = js.native
}

object CollectionOptions {
  @scala.inline
  def apply[E](
    adaptiveBinaryIndices: Boolean,
    asyncListeners: Boolean,
    autoupdate: Boolean,
    clone: Boolean,
    cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`,
    disableChangesApi: Boolean,
    disableDeltaChangesApi: Boolean,
    disableMeta: Boolean,
    exact: js.Array[/* keyof E */ String],
    indices: (/* keyof E */ String) | (js.Array[/* keyof E */ String]),
    serializableIndices: Boolean,
    transactional: Boolean,
    ttl: Double,
    ttlInterval: Double,
    unique: js.Array[/* keyof E */ String]
  ): CollectionOptions[E] = {
    val __obj = js.Dynamic.literal(adaptiveBinaryIndices = adaptiveBinaryIndices.asInstanceOf[js.Any], asyncListeners = asyncListeners.asInstanceOf[js.Any], autoupdate = autoupdate.asInstanceOf[js.Any], clone = clone.asInstanceOf[js.Any], cloneMethod = cloneMethod.asInstanceOf[js.Any], disableChangesApi = disableChangesApi.asInstanceOf[js.Any], disableDeltaChangesApi = disableDeltaChangesApi.asInstanceOf[js.Any], disableMeta = disableMeta.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], serializableIndices = serializableIndices.asInstanceOf[js.Any], transactional = transactional.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptions[E]]
  }
  @scala.inline
  implicit class CollectionOptionsOps[Self[e] <: CollectionOptions[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withAdaptiveBinaryIndices(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveBinaryIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncListeners(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoupdate(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableChangesApi(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableChangesApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableDeltaChangesApi(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDeltaChangesApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableMeta(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExact(value: js.Array[/* keyof E */ String]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: (/* keyof E */ String) | (js.Array[/* keyof E */ String])): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializableIndices(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializableIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactional(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtlInterval(value: Double): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttlInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: js.Array[/* keyof E */ String]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

