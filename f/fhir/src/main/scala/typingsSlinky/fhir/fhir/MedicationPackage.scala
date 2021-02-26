package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about packaged medications
  */
@js.native
trait MedicationPackage extends BackboneElement {
  
  /**
    * Identifies a single production run
    */
  var batch: js.UndefOr[js.Array[MedicationPackageBatch]] = js.native
  
  /**
    * E.g. box, vial, blister-pack
    */
  var container: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What is  in the package
    */
  var content: js.UndefOr[js.Array[MedicationPackageContent]] = js.native
}
object MedicationPackage {
  
  @scala.inline
  def apply(): MedicationPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackage]
  }
  
  @scala.inline
  implicit class MedicationPackageMutableBuilder[Self <: MedicationPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: js.Array[MedicationPackageBatch]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setBatchVarargs(value: MedicationPackageBatch*): Self = StObject.set(x, "batch", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: CodeableConcept): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContent(value: js.Array[MedicationPackageContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: MedicationPackageContent*): Self = StObject.set(x, "content", js.Array(value :_*))
  }
}
