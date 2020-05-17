package typingsSlinky.androiduix.android.app.AlertController

import typingsSlinky.androiduix.android.app.AlertController.AlertParams.OnPrepareListViewListener
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.content.DialogInterface.OnCancelListener
import typingsSlinky.androiduix.android.content.DialogInterface.OnClickListener
import typingsSlinky.androiduix.android.content.DialogInterface.OnDismissListener
import typingsSlinky.androiduix.android.content.DialogInterface.OnKeyListener
import typingsSlinky.androiduix.android.content.DialogInterface.OnMultiChoiceClickListener
import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.view.LayoutInflater
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typingsSlinky.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertParams_ extends js.Object {
  var mAdapter: ListAdapter = js.native
  var mCancelable: Boolean = js.native
  var mCheckedItem: Double = js.native
  var mCheckedItems: js.Array[Boolean] = js.native
  var mContext: Context = js.native
  var mCustomTitleView: View = js.native
  var mForceInverseBackground: Boolean = js.native
  var mIcon: Drawable = js.native
  var mIconId: Double = js.native
  var mInflater: LayoutInflater = js.native
  var mIsCheckedColumn: String = js.native
  var mIsMultiChoice: Boolean = js.native
  var mIsSingleChoice: Boolean = js.native
  var mItems: js.Array[String] = js.native
  var mLabelColumn: String = js.native
  var mMessage: String = js.native
  var mNegativeButtonListener: OnClickListener = js.native
  var mNegativeButtonText: String = js.native
  var mNeutralButtonListener: OnClickListener = js.native
  var mNeutralButtonText: String = js.native
  var mOnCancelListener: OnCancelListener = js.native
  var mOnCheckboxClickListener: OnMultiChoiceClickListener = js.native
  var mOnClickListener: OnClickListener = js.native
  var mOnDismissListener: OnDismissListener = js.native
  var mOnItemSelectedListener: OnItemSelectedListener = js.native
  var mOnKeyListener: OnKeyListener = js.native
  var mOnPrepareListViewListener: OnPrepareListViewListener = js.native
  var mPositiveButtonListener: OnClickListener = js.native
  var mPositiveButtonText: String = js.native
  var mRecycleOnMeasure: Boolean = js.native
  var mTitle: String = js.native
  var mView: View = js.native
  var mViewSpacingBottom: Double = js.native
  var mViewSpacingLeft: Double = js.native
  var mViewSpacingRight: Double = js.native
  var mViewSpacingSpecified: Boolean = js.native
  var mViewSpacingTop: Double = js.native
  @JSName("apply")
  def apply(dialog: typingsSlinky.androiduix.android.app.AlertController): Unit = js.native
  /* private */ def createListView(dialog: js.Any): js.Any = js.native
}

object AlertParams_ {
  @scala.inline
  def apply(
    apply: typingsSlinky.androiduix.android.app.AlertController => Unit,
    createListView: js.Any => js.Any,
    mAdapter: ListAdapter,
    mCancelable: Boolean,
    mCheckedItem: Double,
    mCheckedItems: js.Array[Boolean],
    mContext: Context,
    mCustomTitleView: View,
    mForceInverseBackground: Boolean,
    mIcon: Drawable,
    mIconId: Double,
    mInflater: LayoutInflater,
    mIsCheckedColumn: String,
    mIsMultiChoice: Boolean,
    mIsSingleChoice: Boolean,
    mItems: js.Array[String],
    mLabelColumn: String,
    mMessage: String,
    mNegativeButtonListener: OnClickListener,
    mNegativeButtonText: String,
    mNeutralButtonListener: OnClickListener,
    mNeutralButtonText: String,
    mOnCancelListener: OnCancelListener,
    mOnCheckboxClickListener: OnMultiChoiceClickListener,
    mOnClickListener: OnClickListener,
    mOnDismissListener: OnDismissListener,
    mOnItemSelectedListener: OnItemSelectedListener,
    mOnKeyListener: OnKeyListener,
    mOnPrepareListViewListener: OnPrepareListViewListener,
    mPositiveButtonListener: OnClickListener,
    mPositiveButtonText: String,
    mRecycleOnMeasure: Boolean,
    mTitle: String,
    mView: View,
    mViewSpacingBottom: Double,
    mViewSpacingLeft: Double,
    mViewSpacingRight: Double,
    mViewSpacingSpecified: Boolean,
    mViewSpacingTop: Double
  ): AlertParams_ = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), createListView = js.Any.fromFunction1(createListView), mAdapter = mAdapter.asInstanceOf[js.Any], mCancelable = mCancelable.asInstanceOf[js.Any], mCheckedItem = mCheckedItem.asInstanceOf[js.Any], mCheckedItems = mCheckedItems.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mCustomTitleView = mCustomTitleView.asInstanceOf[js.Any], mForceInverseBackground = mForceInverseBackground.asInstanceOf[js.Any], mIcon = mIcon.asInstanceOf[js.Any], mIconId = mIconId.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mIsCheckedColumn = mIsCheckedColumn.asInstanceOf[js.Any], mIsMultiChoice = mIsMultiChoice.asInstanceOf[js.Any], mIsSingleChoice = mIsSingleChoice.asInstanceOf[js.Any], mItems = mItems.asInstanceOf[js.Any], mLabelColumn = mLabelColumn.asInstanceOf[js.Any], mMessage = mMessage.asInstanceOf[js.Any], mNegativeButtonListener = mNegativeButtonListener.asInstanceOf[js.Any], mNegativeButtonText = mNegativeButtonText.asInstanceOf[js.Any], mNeutralButtonListener = mNeutralButtonListener.asInstanceOf[js.Any], mNeutralButtonText = mNeutralButtonText.asInstanceOf[js.Any], mOnCancelListener = mOnCancelListener.asInstanceOf[js.Any], mOnCheckboxClickListener = mOnCheckboxClickListener.asInstanceOf[js.Any], mOnClickListener = mOnClickListener.asInstanceOf[js.Any], mOnDismissListener = mOnDismissListener.asInstanceOf[js.Any], mOnItemSelectedListener = mOnItemSelectedListener.asInstanceOf[js.Any], mOnKeyListener = mOnKeyListener.asInstanceOf[js.Any], mOnPrepareListViewListener = mOnPrepareListViewListener.asInstanceOf[js.Any], mPositiveButtonListener = mPositiveButtonListener.asInstanceOf[js.Any], mPositiveButtonText = mPositiveButtonText.asInstanceOf[js.Any], mRecycleOnMeasure = mRecycleOnMeasure.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], mView = mView.asInstanceOf[js.Any], mViewSpacingBottom = mViewSpacingBottom.asInstanceOf[js.Any], mViewSpacingLeft = mViewSpacingLeft.asInstanceOf[js.Any], mViewSpacingRight = mViewSpacingRight.asInstanceOf[js.Any], mViewSpacingSpecified = mViewSpacingSpecified.asInstanceOf[js.Any], mViewSpacingTop = mViewSpacingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertParams_]
  }
  @scala.inline
  implicit class AlertParams_Ops[Self <: AlertParams_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: typingsSlinky.androiduix.android.app.AlertController => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateListView(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createListView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMAdapter(value: ListAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCheckedItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCheckedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCheckedItems(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCheckedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCustomTitleView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCustomTitleView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMForceInverseBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mForceInverseBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIcon(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIconId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIconId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInflater(value: LayoutInflater): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInflater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsCheckedColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsCheckedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsMultiChoice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsMultiChoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsSingleChoice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsSingleChoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLabelColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLabelColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNegativeButtonListener(value: OnClickListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNegativeButtonListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNegativeButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNegativeButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNeutralButtonListener(value: OnClickListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNeutralButtonListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNeutralButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNeutralButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnCancelListener(value: OnCancelListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnCancelListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnCheckboxClickListener(value: OnMultiChoiceClickListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnCheckboxClickListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnClickListener(value: OnClickListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnClickListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnDismissListener(value: OnDismissListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnDismissListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnItemSelectedListener(value: OnItemSelectedListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnItemSelectedListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnKeyListener(value: OnKeyListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnKeyListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnPrepareListViewListener(value: OnPrepareListViewListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnPrepareListViewListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPositiveButtonListener(value: OnClickListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPositiveButtonListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPositiveButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPositiveButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRecycleOnMeasure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRecycleOnMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewSpacingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewSpacingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewSpacingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewSpacingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewSpacingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewSpacingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewSpacingSpecified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewSpacingSpecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewSpacingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewSpacingTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

