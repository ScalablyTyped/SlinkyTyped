package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Path of the field to select in the specified API version.
    */
  var fieldPath: Input[String] = js.native
}

object ObjectFieldSelector {
  @scala.inline
  def apply(fieldPath: Input[String]): ObjectFieldSelector = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldSelector]
  }
  @scala.inline
  implicit class ObjectFieldSelectorOps[Self <: ObjectFieldSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
  }
  
}

