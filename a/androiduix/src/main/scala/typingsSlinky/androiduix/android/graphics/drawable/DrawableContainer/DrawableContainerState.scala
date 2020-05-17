package typingsSlinky.androiduix.android.graphics.drawable.DrawableContainer

import typingsSlinky.androiduix.android.graphics.Rect
import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawableContainerState extends ConstantState {
  var mAutoMirrored: Boolean = js.native
  var mCanConstantState: Boolean = js.native
  var mCheckedConstantState: Boolean = js.native
  var mCheckedOpacity: Boolean = js.native
  var mCheckedStateful: Boolean = js.native
  var mComputedConstantSize: Boolean = js.native
  var mConstantHeight: Double = js.native
  var mConstantMinimumHeight: Double = js.native
  var mConstantMinimumWidth: Double = js.native
  var mConstantPadding: Rect = js.native
  var mConstantSize: Boolean = js.native
  var mConstantWidth: Double = js.native
  var mDither: Boolean = js.native
  var mDrawableFutures: js.Any = js.native
  var mDrawables: js.Array[Drawable] = js.native
  var mEnterFadeDuration: Double = js.native
  var mExitFadeDuration: Double = js.native
  var mMutated: Boolean = js.native
  val mNumChildren: Double = js.native
  var mOpacity: Double = js.native
  var mOwner: typingsSlinky.androiduix.android.graphics.drawable.DrawableContainer = js.native
  var mPaddingChecked: Boolean = js.native
  var mStateful: Boolean = js.native
  var mVariablePadding: Boolean = js.native
  def addChild(dr: Drawable): Double = js.native
  def canConstantState(): Boolean = js.native
  def computeConstantSize(): Unit = js.native
  /* private */ def createAllFutures(): js.Any = js.native
  def getCapacity(): Double = js.native
  def getChild(index: Double): Drawable = js.native
  def getChildCount(): Double = js.native
  def getChildren(): js.Array[Drawable] = js.native
  def getConstantHeight(): Double = js.native
  def getConstantMinimumHeight(): Double = js.native
  def getConstantMinimumWidth(): Double = js.native
  def getConstantPadding(): Rect = js.native
  def getConstantWidth(): Double = js.native
  def getEnterFadeDuration(): Double = js.native
  def getExitFadeDuration(): Double = js.native
  def getOpacity(): Double = js.native
  def isConstantSize(): Boolean = js.native
  def isStateful(): Boolean = js.native
  def mutate(): Unit = js.native
  def setConstantSize(constant: Boolean): Unit = js.native
  def setEnterFadeDuration(duration: Double): Unit = js.native
  def setExitFadeDuration(duration: Double): Unit = js.native
  def setVariablePadding(variable: Boolean): Unit = js.native
}

object DrawableContainerState {
  @scala.inline
  def apply(
    addChild: Drawable => Double,
    canConstantState: () => Boolean,
    computeConstantSize: () => Unit,
    createAllFutures: () => js.Any,
    getCapacity: () => Double,
    getChild: Double => Drawable,
    getChildCount: () => Double,
    getChildren: () => js.Array[Drawable],
    getConstantHeight: () => Double,
    getConstantMinimumHeight: () => Double,
    getConstantMinimumWidth: () => Double,
    getConstantPadding: () => Rect,
    getConstantWidth: () => Double,
    getEnterFadeDuration: () => Double,
    getExitFadeDuration: () => Double,
    getOpacity: () => Double,
    isConstantSize: () => Boolean,
    isStateful: () => Boolean,
    mAutoMirrored: Boolean,
    mCanConstantState: Boolean,
    mCheckedConstantState: Boolean,
    mCheckedOpacity: Boolean,
    mCheckedStateful: Boolean,
    mComputedConstantSize: Boolean,
    mConstantHeight: Double,
    mConstantMinimumHeight: Double,
    mConstantMinimumWidth: Double,
    mConstantPadding: Rect,
    mConstantSize: Boolean,
    mConstantWidth: Double,
    mDither: Boolean,
    mDrawableFutures: js.Any,
    mDrawables: js.Array[Drawable],
    mEnterFadeDuration: Double,
    mExitFadeDuration: Double,
    mMutated: Boolean,
    mNumChildren: Double,
    mOpacity: Double,
    mOwner: typingsSlinky.androiduix.android.graphics.drawable.DrawableContainer,
    mPaddingChecked: Boolean,
    mStateful: Boolean,
    mVariablePadding: Boolean,
    mutate: () => Unit,
    newDrawable: () => Drawable,
    setConstantSize: Boolean => Unit,
    setEnterFadeDuration: Double => Unit,
    setExitFadeDuration: Double => Unit,
    setVariablePadding: Boolean => Unit
  ): DrawableContainerState = {
    val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), canConstantState = js.Any.fromFunction0(canConstantState), computeConstantSize = js.Any.fromFunction0(computeConstantSize), createAllFutures = js.Any.fromFunction0(createAllFutures), getCapacity = js.Any.fromFunction0(getCapacity), getChild = js.Any.fromFunction1(getChild), getChildCount = js.Any.fromFunction0(getChildCount), getChildren = js.Any.fromFunction0(getChildren), getConstantHeight = js.Any.fromFunction0(getConstantHeight), getConstantMinimumHeight = js.Any.fromFunction0(getConstantMinimumHeight), getConstantMinimumWidth = js.Any.fromFunction0(getConstantMinimumWidth), getConstantPadding = js.Any.fromFunction0(getConstantPadding), getConstantWidth = js.Any.fromFunction0(getConstantWidth), getEnterFadeDuration = js.Any.fromFunction0(getEnterFadeDuration), getExitFadeDuration = js.Any.fromFunction0(getExitFadeDuration), getOpacity = js.Any.fromFunction0(getOpacity), isConstantSize = js.Any.fromFunction0(isConstantSize), isStateful = js.Any.fromFunction0(isStateful), mAutoMirrored = mAutoMirrored.asInstanceOf[js.Any], mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mCheckedOpacity = mCheckedOpacity.asInstanceOf[js.Any], mCheckedStateful = mCheckedStateful.asInstanceOf[js.Any], mComputedConstantSize = mComputedConstantSize.asInstanceOf[js.Any], mConstantHeight = mConstantHeight.asInstanceOf[js.Any], mConstantMinimumHeight = mConstantMinimumHeight.asInstanceOf[js.Any], mConstantMinimumWidth = mConstantMinimumWidth.asInstanceOf[js.Any], mConstantPadding = mConstantPadding.asInstanceOf[js.Any], mConstantSize = mConstantSize.asInstanceOf[js.Any], mConstantWidth = mConstantWidth.asInstanceOf[js.Any], mDither = mDither.asInstanceOf[js.Any], mDrawableFutures = mDrawableFutures.asInstanceOf[js.Any], mDrawables = mDrawables.asInstanceOf[js.Any], mEnterFadeDuration = mEnterFadeDuration.asInstanceOf[js.Any], mExitFadeDuration = mExitFadeDuration.asInstanceOf[js.Any], mMutated = mMutated.asInstanceOf[js.Any], mNumChildren = mNumChildren.asInstanceOf[js.Any], mOpacity = mOpacity.asInstanceOf[js.Any], mOwner = mOwner.asInstanceOf[js.Any], mPaddingChecked = mPaddingChecked.asInstanceOf[js.Any], mStateful = mStateful.asInstanceOf[js.Any], mVariablePadding = mVariablePadding.asInstanceOf[js.Any], mutate = js.Any.fromFunction0(mutate), newDrawable = js.Any.fromFunction0(newDrawable), setConstantSize = js.Any.fromFunction1(setConstantSize), setEnterFadeDuration = js.Any.fromFunction1(setEnterFadeDuration), setExitFadeDuration = js.Any.fromFunction1(setExitFadeDuration), setVariablePadding = js.Any.fromFunction1(setVariablePadding))
    __obj.asInstanceOf[DrawableContainerState]
  }
  @scala.inline
  implicit class DrawableContainerStateOps[Self <: DrawableContainerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChild(value: Drawable => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanConstantState(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canConstantState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeConstantSize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeConstantSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateAllFutures(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAllFutures")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCapacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCapacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChild(value: Double => Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChildren(value: () => js.Array[Drawable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConstantHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstantHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConstantMinimumHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstantMinimumHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConstantMinimumWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstantMinimumWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConstantPadding(value: () => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstantPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConstantWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstantWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnterFadeDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnterFadeDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExitFadeDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExitFadeDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConstantSize(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstantSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStateful(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateful")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMAutoMirrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAutoMirrored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCanConstantState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCanConstantState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCheckedConstantState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCheckedConstantState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCheckedOpacity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCheckedOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCheckedStateful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCheckedStateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMComputedConstantSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mComputedConstantSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMConstantHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mConstantHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMConstantMinimumHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mConstantMinimumHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMConstantMinimumWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mConstantMinimumWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMConstantPadding(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mConstantPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMConstantSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mConstantSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMConstantWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mConstantWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDither(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDither")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawableFutures(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawableFutures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDrawables(value: js.Array[Drawable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEnterFadeDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mEnterFadeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMExitFadeDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mExitFadeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMutated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMutated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNumChildren(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNumChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOwner(value: typingsSlinky.androiduix.android.graphics.drawable.DrawableContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPaddingChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPaddingChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStateful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMVariablePadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mVariablePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetConstantSize(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setConstantSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnterFadeDuration(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnterFadeDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetExitFadeDuration(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExitFadeDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVariablePadding(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVariablePadding")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

