package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details about how to run the execution.
  */
@js.native
trait SchemaSpecification extends js.Object {
  /**
    * An Android mobile test execution specification.
    */
  var androidTest: js.UndefOr[SchemaAndroidTest] = js.native
}

object SchemaSpecification {
  @scala.inline
  def apply(): SchemaSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpecification]
  }
  @scala.inline
  implicit class SchemaSpecificationOps[Self <: SchemaSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidTest(value: SchemaAndroidTest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidTest")(js.undefined)
        ret
    }
  }
  
}

