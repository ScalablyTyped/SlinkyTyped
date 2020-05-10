package typingsSlinky.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.DAVCollection<T>> */
@js.native
trait DAVCollectionOptions[T] extends js.Object {
  var account: js.UndefOr[Account] = js.native
  var constructor: js.UndefOr[js.Function1[/* options */ DAVCollectionOptions[T], js.Any]] = js.native
  var ctag: js.UndefOr[String] = js.native
  var data: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var objects: js.UndefOr[js.Array[T]] = js.native
  var reports: js.UndefOr[js.Array[String]] = js.native
  var resourcetype: js.UndefOr[String] = js.native
  var syncToken: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object DAVCollectionOptions {
  @scala.inline
  def apply[T](): DAVCollectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DAVCollectionOptions[T]]
  }
  @scala.inline
  implicit class DAVCollectionOptionsOps[Self[t] <: DAVCollectionOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAccount(value: Account): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withConstructor(value: /* options */ DAVCollectionOptions[T] => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConstructor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.undefined)
        ret
    }
    @scala.inline
    def withCtag(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtag: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctag")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withReports(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcetype(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcetype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcetype: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcetype")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncToken(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncToken: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

