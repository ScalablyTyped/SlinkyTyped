package typingsSlinky.reactOnsenui

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   dataSource ? :std.Array<any>,   renderRow ? :(row : any, index ? : number): react.react._Global_.JSX.Element | undefined,   renderFooter ? :(): react.react._Global_.JSX.Element | undefined,   renderHeader ? :(): react.react._Global_.JSX.Element | undefined} */
trait HTMLAttributesidclassNameDataSource extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[ReactElement]]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[ReactElement]]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function2[/* row */ js.Any, /* index */ js.UndefOr[Double], js.UndefOr[ReactElement]]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameDataSource {
  @scala.inline
  def apply(
    className: String = null,
    dataSource: js.Array[_] = null,
    id: String = null,
    modifier: String = null,
    renderFooter: () => js.UndefOr[ReactElement] = null,
    renderHeader: () => js.UndefOr[ReactElement] = null,
    renderRow: (/* row */ js.Any, /* index */ js.UndefOr[Double]) => js.UndefOr[ReactElement] = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameDataSource = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction2(renderRow))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameDataSource]
  }
}

