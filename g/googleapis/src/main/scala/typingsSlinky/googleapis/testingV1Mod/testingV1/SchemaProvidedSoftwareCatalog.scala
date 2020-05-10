package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently provided software environment on the devices under test.
  */
@js.native
trait SchemaProvidedSoftwareCatalog extends js.Object {
  /**
    * A string representing the current version of Android Test Orchestrator
    * that is provided by TestExecutionService. Example: &quot;1.0.2
    * beta&quot;.
    */
  var orchestratorVersion: js.UndefOr[String] = js.native
}

object SchemaProvidedSoftwareCatalog {
  @scala.inline
  def apply(): SchemaProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvidedSoftwareCatalog]
  }
  @scala.inline
  implicit class SchemaProvidedSoftwareCatalogOps[Self <: SchemaProvidedSoftwareCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrchestratorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orchestratorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrchestratorVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orchestratorVersion")(js.undefined)
        ret
    }
  }
  
}

