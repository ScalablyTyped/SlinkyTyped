package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVerifyVaultJob extends js.Object {
  val FixErrors: Boolean = js.native
  val VaultGUID: String = js.native
  val VerifyFileContents: Boolean = js.native
  def Clone(): IVerifyVaultJob = js.native
  def GetNumberOfSteps(): Double = js.native
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  def GetStepProgressText(CurrentStep: Double): String = js.native
  def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit = js.native
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
  implicit class IVerifyVaultJobOps[Self <: IVerifyVaultJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IVerifyVaultJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFixErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNumberOfSteps(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNumberOfSteps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOneBasedIndexOfStep(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOneBasedIndexOfStep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStepProgressText(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStepProgressText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifyFileContents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyFileContents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

