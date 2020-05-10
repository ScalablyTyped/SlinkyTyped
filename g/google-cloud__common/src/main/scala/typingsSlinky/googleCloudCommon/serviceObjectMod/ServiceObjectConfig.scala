package typingsSlinky.googleCloudCommon.serviceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceObjectConfig extends js.Object {
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * The method which creates this object.
    */
  var createMethod: js.UndefOr[js.Function] = js.native
  /**
    * The identifier of the object. For example, the name of a Storage bucket or
    * Pub/Sub topic.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of each method name that should be inherited.
    */
  var methods: js.UndefOr[Methods] = js.native
  /**
    * The parent service instance. For example, an instance of Storage if the
    * object is Bucket.
    */
  var parent: ServiceObjectParent = js.native
}

object ServiceObjectConfig {
  @scala.inline
  def apply(parent: ServiceObjectParent): ServiceObjectConfig = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceObjectConfig]
  }
  @scala.inline
  implicit class ServiceObjectConfigOps[Self <: ServiceObjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: ServiceObjectParent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateMethod(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: Methods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
  }
  
}

