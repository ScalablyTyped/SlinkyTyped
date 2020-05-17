package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.content.Intent
import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.view.MenuItem.OnMenuItemClickListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem_ extends js.Object {
  var mActionView: js.Any = js.native
  var mCategoryOrder: js.Any = js.native
  var mClickListener: js.Any = js.native
  var mEnable: js.Any = js.native
  var mGroup: js.Any = js.native
  var mIconDrawable: js.Any = js.native
  var mId: js.Any = js.native
  var mIntent: js.Any = js.native
  var mMenu: js.Any = js.native
  var mOrdering: js.Any = js.native
  var mTitle: js.Any = js.native
  var mVisible: js.Any = js.native
  def getActionView(): View = js.native
  def getGroupId(): Double = js.native
  def getIcon(): Drawable = js.native
  def getIntent(): Intent = js.native
  def getItemId(): Double = js.native
  def getOrder(): Double = js.native
  def getTitle(): String = js.native
  def invoke(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def setActionView(view: View): MenuItem = js.native
  def setEnabled(enabled: Boolean): MenuItem = js.native
  def setIcon(icon: Drawable): MenuItem = js.native
  def setIntent(intent: Intent): MenuItem = js.native
  def setOnMenuItemClickListener(menuItemClickListener: OnMenuItemClickListener): MenuItem = js.native
  def setTitle(title: String): MenuItem = js.native
  def setVisible(visible: Boolean): MenuItem = js.native
}

object MenuItem_ {
  @scala.inline
  def apply(
    getActionView: () => View,
    getGroupId: () => Double,
    getIcon: () => Drawable,
    getIntent: () => Intent,
    getItemId: () => Double,
    getOrder: () => Double,
    getTitle: () => String,
    invoke: () => Boolean,
    isEnabled: () => Boolean,
    isVisible: () => Boolean,
    mActionView: js.Any,
    mCategoryOrder: js.Any,
    mClickListener: js.Any,
    mEnable: js.Any,
    mGroup: js.Any,
    mIconDrawable: js.Any,
    mId: js.Any,
    mIntent: js.Any,
    mMenu: js.Any,
    mOrdering: js.Any,
    mTitle: js.Any,
    mVisible: js.Any,
    setActionView: View => MenuItem,
    setEnabled: Boolean => MenuItem,
    setIcon: Drawable => MenuItem,
    setIntent: Intent => MenuItem,
    setOnMenuItemClickListener: OnMenuItemClickListener => MenuItem,
    setTitle: String => MenuItem,
    setVisible: Boolean => MenuItem
  ): MenuItem_ = {
    val __obj = js.Dynamic.literal(getActionView = js.Any.fromFunction0(getActionView), getGroupId = js.Any.fromFunction0(getGroupId), getIcon = js.Any.fromFunction0(getIcon), getIntent = js.Any.fromFunction0(getIntent), getItemId = js.Any.fromFunction0(getItemId), getOrder = js.Any.fromFunction0(getOrder), getTitle = js.Any.fromFunction0(getTitle), invoke = js.Any.fromFunction0(invoke), isEnabled = js.Any.fromFunction0(isEnabled), isVisible = js.Any.fromFunction0(isVisible), mActionView = mActionView.asInstanceOf[js.Any], mCategoryOrder = mCategoryOrder.asInstanceOf[js.Any], mClickListener = mClickListener.asInstanceOf[js.Any], mEnable = mEnable.asInstanceOf[js.Any], mGroup = mGroup.asInstanceOf[js.Any], mIconDrawable = mIconDrawable.asInstanceOf[js.Any], mId = mId.asInstanceOf[js.Any], mIntent = mIntent.asInstanceOf[js.Any], mMenu = mMenu.asInstanceOf[js.Any], mOrdering = mOrdering.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], mVisible = mVisible.asInstanceOf[js.Any], setActionView = js.Any.fromFunction1(setActionView), setEnabled = js.Any.fromFunction1(setEnabled), setIcon = js.Any.fromFunction1(setIcon), setIntent = js.Any.fromFunction1(setIntent), setOnMenuItemClickListener = js.Any.fromFunction1(setOnMenuItemClickListener), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[MenuItem_]
  }
  @scala.inline
  implicit class MenuItem_Ops[Self <: MenuItem_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActionView(value: () => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActionView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIcon(value: () => Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIcon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIntent(value: () => Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIntent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrder(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvoke(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMActionView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActionView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCategoryOrder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCategoryOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMClickListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mClickListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEnable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIconDrawable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIconDrawable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIntent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMenu(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOrdering(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMVisible(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetActionView(value: View => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActionView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnabled(value: Boolean => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIcon(value: Drawable => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIntent(value: Intent => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnMenuItemClickListener(value: OnMenuItemClickListener => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnMenuItemClickListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

