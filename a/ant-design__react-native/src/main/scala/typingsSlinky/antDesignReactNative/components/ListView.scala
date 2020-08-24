package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.Highlight
import typingsSlinky.antDesignReactNative.listViewMod.ListViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListView {
  @JSImport("@ant-design/react-native", "ListView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.ListView[T]] {
    @scala.inline
    def allLoadedText(value: js.Any): this.type = set("allLoadedText", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowImageSource(value: js.Any): this.type = set("arrowImageSource", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowImageStyle(value: js.Any): this.type = set("arrowImageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPagination(value: js.Any): this.type = set("autoPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def customRefreshControl(value: js.Any): this.type = set("customRefreshControl", value.asInstanceOf[js.Any])
    @scala.inline
    def customRefreshView(value: js.Any): this.type = set("customRefreshView", value.asInstanceOf[js.Any])
    @scala.inline
    def dateFormat(value: js.Any): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def dateStyle(value: js.Any): this.type = set("dateStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dateTitle(value: js.Any): this.type = set("dateTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def displayDate(value: js.Any): this.type = set("displayDate", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyView(value: js.Any): this.type = set("emptyView", value.asInstanceOf[js.Any])
    @scala.inline
    def enableEmptySections(value: js.Any): this.type = set("enableEmptySections", value.asInstanceOf[js.Any])
    @scala.inline
    def fetchingSpinnerSize(value: js.Any): this.type = set("fetchingSpinnerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def firstLoader(value: js.Any): this.type = set("firstLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: js.Any): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def initialNumToRender(value: js.Any): this.type = set("initialNumToRender", value.asInstanceOf[js.Any])
    @scala.inline
    def keyExtractor(value: (T, /* index */ Double) => String): this.type = set("keyExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def numColumns(value: Double): this.type = set("numColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def pagination(value: js.Any): this.type = set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def paginationAllLoadedView(value: js.Any): this.type = set("paginationAllLoadedView", value.asInstanceOf[js.Any])
    @scala.inline
    def paginationBtnText(value: js.Any): this.type = set("paginationBtnText", value.asInstanceOf[js.Any])
    @scala.inline
    def paginationFetchingView(value: js.Any): this.type = set("paginationFetchingView", value.asInstanceOf[js.Any])
    @scala.inline
    def paginationWaitingView(value: js.Any): this.type = set("paginationWaitingView", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshViewHeight(value: js.Any): this.type = set("refreshViewHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshViewStyle(value: js.Any): this.type = set("refreshViewStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshable(value: js.Any): this.type = set("refreshable", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableColors(value: js.Any): this.type = set("refreshableColors", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableMode(value: js.Any): this.type = set("refreshableMode", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableProgressBackgroundColor(value: js.Any): this.type = set("refreshableProgressBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableSize(value: js.Any): this.type = set("refreshableSize", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableTintColor(value: js.Any): this.type = set("refreshableTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableTitle(value: js.Any): this.type = set("refreshableTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableTitlePull(value: js.Any): this.type = set("refreshableTitlePull", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableTitleRefreshing(value: js.Any): this.type = set("refreshableTitleRefreshing", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshableTitleRelease(value: js.Any): this.type = set("refreshableTitleRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollEnabled(value: js.Any): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def separator(value: js.Any): this.type = set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def spinnerColor(value: js.Any): this.type = set("spinnerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def waitingSpinnerSize(value: js.Any): this.type = set("waitingSpinnerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def waitingSpinnerText(value: js.Any): this.type = set("waitingSpinnerText", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ListViewProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](
    onFetch: (Double, js.Function0[_], js.Function0[Unit]) => Unit,
    renderItem: (T, Double, Highlight) => ReactElement | Null
  ): Builder[T] = {
    val __props = js.Dynamic.literal(onFetch = js.Any.fromFunction3(onFetch), renderItem = js.Any.fromFunction3(renderItem))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ListViewProps[T]]))
  }
}

