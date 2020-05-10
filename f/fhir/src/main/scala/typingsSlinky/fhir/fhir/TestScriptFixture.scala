package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fixture in the test script - by reference (uri)
  */
@js.native
trait TestScriptFixture extends BackboneElement {
  /**
    * Contains extended information for property 'autocreate'.
    */
  var _autocreate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'autodelete'.
    */
  var _autodelete: js.UndefOr[Element] = js.native
  /**
    * Whether or not to implicitly create the fixture during setup
    */
  var autocreate: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to implicitly delete the fixture during teardown
    */
  var autodelete: js.UndefOr[Boolean] = js.native
  /**
    * Reference of the resource
    */
  var resource: js.UndefOr[Reference] = js.native
}

object TestScriptFixture {
  @scala.inline
  def apply(): TestScriptFixture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptFixture]
  }
  @scala.inline
  implicit class TestScriptFixtureOps[Self <: TestScriptFixture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_autocreate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_autocreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_autocreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_autocreate")(js.undefined)
        ret
    }
    @scala.inline
    def with_autodelete(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_autodelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_autodelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_autodelete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutodelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutodelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodelete")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

