package typingsSlinky.idyllDocument.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.idyllCompiler.mod.AST
import typingsSlinky.idyllCompiler.mod.Options
import typingsSlinky.idyllDocument.AnonChildren
import typingsSlinky.idyllDocument.mod.IdyllDocumentProps
import typingsSlinky.idyllDocument.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IdyllDocument
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("idyll-document", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    components: js.Any,
    ast: AST = null,
    compilerOptions: Options = null,
    context: /* context */ js.Any => Unit = null,
    datasets: js.Object = null,
    errorComponent: ReactComponentClass[AnonChildren] = null,
    initialState: js.Any = null,
    layout: String = null,
    markup: String = null,
    onError: /* err */ js.Error => Unit = null,
    theme: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(js.Any.fromFunction1(context))
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (errorComponent != null) __obj.updateDynamic("errorComponent")(errorComponent.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IdyllDocumentProps
}

