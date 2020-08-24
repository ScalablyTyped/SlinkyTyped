package typingsSlinky.androiduix.global.androidui

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget")
@js.native
object widget extends js.Object {
  @js.native
  class HtmlBaseView protected ()
    extends typingsSlinky.androiduix.androidui.widget.HtmlBaseView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
  
  @js.native
  class HtmlDataListAdapter ()
    extends typingsSlinky.androiduix.androidui.widget.HtmlDataListAdapter
  
  @js.native
  class HtmlDataPagerAdapter ()
    extends typingsSlinky.androiduix.androidui.widget.HtmlDataPagerAdapter
  
  @js.native
  class HtmlDataPickerAdapter ()
    extends typingsSlinky.androiduix.androidui.widget.HtmlDataPickerAdapter
  
  @js.native
  class HtmlImageView protected ()
    extends typingsSlinky.androiduix.androidui.widget.HtmlImageView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
  
  @js.native
  class HtmlView protected ()
    extends typingsSlinky.androiduix.androidui.widget.HtmlView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
  
  @js.native
  class PullRefreshLoadLayout protected ()
    extends typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
  
  /* static members */
  @js.native
  object HtmlDataListAdapter extends js.Object {
    var BindAdapterProperty: String = js.native
    var RefElementProperty: String = js.native
    var RefElementTag: String = js.native
  }
  
  /* static members */
  @js.native
  object HtmlDataPagerAdapter extends js.Object {
    var BindAdapterProperty: String = js.native
    var RefElementProperty: String = js.native
    var RefElementTag: String = js.native
  }
  
  @js.native
  object OverScrollLocker extends js.Object {
    def getFrom(view: View): typingsSlinky.androiduix.androidui.widget.OverScrollLocker = js.native
  }
  
  /* static members */
  @js.native
  object PullRefreshLoadLayout extends js.Object {
    @js.native
    class DefaultFooterView protected ()
      extends typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout.DefaultFooterView {
      def this(context: Context) = this()
      def this(context: Context, bindElement: HTMLElement) = this()
      def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
      def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
    }
    
    @js.native
    class DefaultHeaderView protected ()
      extends typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout.DefaultHeaderView {
      def this(context: Context) = this()
      def this(context: Context, bindElement: HTMLElement) = this()
      def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
      def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
    }
    
    @js.native
    abstract class FooterView ()
      extends typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout.FooterView
    
    @js.native
    abstract class HeaderView ()
      extends typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout.HeaderView
    
    var StateChangeLimit: NumberDictionary[js.Array[Double]] = js.native
    var State_Disable: Double = js.native
    var State_Footer_LoadFail: Double = js.native
    var State_Footer_Loading: Double = js.native
    var State_Footer_NoMoreToLoad: Double = js.native
    var State_Footer_Normal: Double = js.native
    var State_Footer_ReadyToLoad: Double = js.native
    var State_Header_Normal: Double = js.native
    var State_Header_ReadyToRefresh: Double = js.native
    var State_Header_RefreshFail: Double = js.native
    var State_Header_Refreshing: Double = js.native
  }
  
}

