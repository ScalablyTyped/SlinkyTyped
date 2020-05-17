package typingsSlinky.androiduix.android.view.View

import typingsSlinky.androiduix.android.graphics.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformationInfo extends js.Object {
  var mAlpha: Double = js.native
  var mInverseMatrix: js.Any = js.native
  var mInverseMatrixDirty: Boolean = js.native
  var mMatrix: Matrix = js.native
  var mMatrixDirty: Boolean = js.native
  var mMatrixIsIdentity: Boolean = js.native
  var mPivotX: Double = js.native
  var mPivotY: Double = js.native
  var mPrevHeight: Double = js.native
  var mPrevWidth: Double = js.native
  var mRotation: Double = js.native
  var mScaleX: Double = js.native
  var mScaleY: Double = js.native
  var mTransitionAlpha: Double = js.native
  var mTranslationX: Double = js.native
  var mTranslationY: Double = js.native
}

object TransformationInfo {
  @scala.inline
  def apply(
    mAlpha: Double,
    mInverseMatrix: js.Any,
    mInverseMatrixDirty: Boolean,
    mMatrix: Matrix,
    mMatrixDirty: Boolean,
    mMatrixIsIdentity: Boolean,
    mPivotX: Double,
    mPivotY: Double,
    mPrevHeight: Double,
    mPrevWidth: Double,
    mRotation: Double,
    mScaleX: Double,
    mScaleY: Double,
    mTransitionAlpha: Double,
    mTranslationX: Double,
    mTranslationY: Double
  ): TransformationInfo = {
    val __obj = js.Dynamic.literal(mAlpha = mAlpha.asInstanceOf[js.Any], mInverseMatrix = mInverseMatrix.asInstanceOf[js.Any], mInverseMatrixDirty = mInverseMatrixDirty.asInstanceOf[js.Any], mMatrix = mMatrix.asInstanceOf[js.Any], mMatrixDirty = mMatrixDirty.asInstanceOf[js.Any], mMatrixIsIdentity = mMatrixIsIdentity.asInstanceOf[js.Any], mPivotX = mPivotX.asInstanceOf[js.Any], mPivotY = mPivotY.asInstanceOf[js.Any], mPrevHeight = mPrevHeight.asInstanceOf[js.Any], mPrevWidth = mPrevWidth.asInstanceOf[js.Any], mRotation = mRotation.asInstanceOf[js.Any], mScaleX = mScaleX.asInstanceOf[js.Any], mScaleY = mScaleY.asInstanceOf[js.Any], mTransitionAlpha = mTransitionAlpha.asInstanceOf[js.Any], mTranslationX = mTranslationX.asInstanceOf[js.Any], mTranslationY = mTranslationY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationInfo]
  }
  @scala.inline
  implicit class TransformationInfoOps[Self <: TransformationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInverseMatrix(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInverseMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInverseMatrixDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInverseMatrixDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMatrixDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMatrixDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMatrixIsIdentity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMatrixIsIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPivotX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPivotX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPivotY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPivotY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPrevHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPrevHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPrevWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPrevWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTransitionAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTransitionAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTranslationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTranslationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTranslationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTranslationY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

