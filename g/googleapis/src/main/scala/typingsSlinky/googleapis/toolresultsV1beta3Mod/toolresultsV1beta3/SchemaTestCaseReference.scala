package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a test case.  Test case references are canonically ordered
  * lexicographically by these three factors: * First, by test_suite_name. *
  * Second, by class_name. * Third, by name.
  */
@js.native
trait SchemaTestCaseReference extends js.Object {
  /**
    * The name of the class.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The name of the test case.  Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the test suite to which this test case belongs.
    */
  var testSuiteName: js.UndefOr[String] = js.native
}

object SchemaTestCaseReference {
  @scala.inline
  def apply(): SchemaTestCaseReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestCaseReference]
  }
  @scala.inline
  implicit class SchemaTestCaseReferenceOps[Self <: SchemaTestCaseReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSuiteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuiteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSuiteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuiteName")(js.undefined)
        ret
    }
  }
  
}

