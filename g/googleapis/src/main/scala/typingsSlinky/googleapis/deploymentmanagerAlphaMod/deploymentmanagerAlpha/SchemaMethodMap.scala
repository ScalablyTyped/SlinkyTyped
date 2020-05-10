package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deployment Manager will call these methods during the events of
  * creation/deletion/update/get/setIamPolicy
  */
@js.native
trait SchemaMethodMap extends js.Object {
  /**
    * The action identifier for the create method to be used for this
    * collection
    */
  var create: js.UndefOr[String] = js.native
  /**
    * The action identifier for the delete method to be used for this
    * collection
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * The action identifier for the get method to be used for this collection
    */
  var get: js.UndefOr[String] = js.native
  /**
    * The action identifier for the setIamPolicy method to be used for this
    * collection
    */
  var setIamPolicy: js.UndefOr[String] = js.native
  /**
    * The action identifier for the update method to be used for this
    * collection
    */
  var update: js.UndefOr[String] = js.native
}

object SchemaMethodMap {
  @scala.inline
  def apply(): SchemaMethodMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethodMap]
  }
  @scala.inline
  implicit class SchemaMethodMapOps[Self <: SchemaMethodMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetIamPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

