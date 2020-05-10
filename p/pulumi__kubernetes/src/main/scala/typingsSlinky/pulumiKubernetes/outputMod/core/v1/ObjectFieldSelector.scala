package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectFieldSelector selects an APIVersioned field of an object.
  */
@js.native
trait ObjectFieldSelector extends js.Object {
  /**
    * Version of the schema the FieldPath is written in terms of, defaults to "v1".
    */
  val apiVersion: String = js.native
  /**
    * Path of the field to select in the specified API version.
    */
  val fieldPath: String = js.native
}

object ObjectFieldSelector {
  @scala.inline
  def apply(apiVersion: String, fieldPath: String): ObjectFieldSelector = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldSelector]
  }
  @scala.inline
  implicit class ObjectFieldSelectorOps[Self <: ObjectFieldSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

