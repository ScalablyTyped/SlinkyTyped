package typingsSlinky.idyllDashDocument.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.idyllDashCompiler.idyllDashCompilerMod.AST
import typingsSlinky.idyllDashCompiler.idyllDashCompilerMod.Options
import typingsSlinky.idyllDashDocument.Anon_Children
import typingsSlinky.idyllDashDocument.idyllDashDocumentMod.IdyllDocumentProps
import typingsSlinky.idyllDashDocument.idyllDashDocumentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IdyllDashDocument
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("idyll-document", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onError */
  def apply(
    components: js.Any,
    ast: AST = null,
    compilerOptions: Options = null,
    context: /* context */ js.Any => Unit = null,
    datasets: js.Object = null,
    errorComponent: ReactComponentClass[Anon_Children] = null,
    initialState: js.Any = null,
    layout: String = null,
    markup: String = null,
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
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IdyllDocumentProps
}

