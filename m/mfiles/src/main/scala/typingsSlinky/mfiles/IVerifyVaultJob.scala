package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVerifyVaultJob extends StObject {
  
  def Clone(): IVerifyVaultJob = js.native
  
  val FixErrors: Boolean = js.native
  
  def GetNumberOfSteps(): Double = js.native
  
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  
  def GetStepProgressText(CurrentStep: Double): String = js.native
  
  def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit = js.native
  
  val VaultGUID: String = js.native
  
  val VerifyFileContents: Boolean = js.native
}
object IVerifyVaultJob {
  
  @scala.inline
  def apply(
    Clone: () => IVerifyVaultJob,
    FixErrors: Boolean,
    GetNumberOfSteps: () => Double,
    GetOneBasedIndexOfStep: Double => Double,
    GetStepProgressText: Double => String,
    Set: (String, Boolean, Boolean) => Unit,
    VaultGUID: String,
    VerifyFileContents: Boolean
  ): IVerifyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FixErrors = FixErrors.asInstanceOf[js.Any], GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction3(Set), VaultGUID = VaultGUID.asInstanceOf[js.Any], VerifyFileContents = VerifyFileContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyVaultJob]
  }
  
  @scala.inline
  implicit class IVerifyVaultJobMutableBuilder[Self <: IVerifyVaultJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IVerifyVaultJob): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFixErrors(value: Boolean): Self = StObject.set(x, "FixErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNumberOfSteps(value: () => Double): Self = StObject.set(x, "GetNumberOfSteps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOneBasedIndexOfStep(value: Double => Double): Self = StObject.set(x, "GetOneBasedIndexOfStep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStepProgressText(value: Double => String): Self = StObject.set(x, "GetStepProgressText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyFileContents(value: Boolean): Self = StObject.set(x, "VerifyFileContents", value.asInstanceOf[js.Any])
  }
}
