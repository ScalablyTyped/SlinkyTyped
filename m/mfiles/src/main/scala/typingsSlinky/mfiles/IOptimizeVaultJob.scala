package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptimizeVaultJob extends js.Object {
  var GarbageCollectFiles: Boolean = js.native
  val Thorough: Boolean = js.native
  val VaultGUID: String = js.native
  def GetNumberOfSteps(): Double = js.native
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  def GetStepProgressText(CurrentStep: Double): String = js.native
  def Set(GuidVault: String, Thorough: Boolean): Unit = js.native
}

object IOptimizeVaultJob {
  @scala.inline
  def apply(
    GarbageCollectFiles: Boolean,
    GetNumberOfSteps: () => Double,
    GetOneBasedIndexOfStep: Double => Double,
    GetStepProgressText: Double => String,
    Set: (String, Boolean) => Unit,
    Thorough: Boolean,
    VaultGUID: String
  ): IOptimizeVaultJob = {
    val __obj = js.Dynamic.literal(GarbageCollectFiles = GarbageCollectFiles.asInstanceOf[js.Any], GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction2(Set), Thorough = Thorough.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptimizeVaultJob]
  }
  @scala.inline
  implicit class IOptimizeVaultJobOps[Self <: IOptimizeVaultJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGarbageCollectFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GarbageCollectFiles")(value.asInstanceOf[js.Any])
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
    def withSet(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withThorough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thorough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

