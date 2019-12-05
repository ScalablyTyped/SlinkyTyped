package typingsSlinky.atJupyterlabUiDashComponents

import slinky.core.facade.ReactElement
import typingsSlinky.atJupyterlabUiDashComponents.libBlueprintMod.IButtonProps
import typingsSlinky.atJupyterlabUiDashComponents.libBlueprintMod.IInputGroupProps
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.IModel
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.INodeOptions
import typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.DockPanelSvg.IOptions
import typingsSlinky.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components", JSImport.Namespace)
@js.native
object atJupyterlabUiDashComponentsMod extends js.Object {
  @js.native
  class DockPanelSvg protected ()
    extends typingsSlinky.atJupyterlabUiDashComponents.libIconMod.DockPanelSvg {
    /**
      * Construct a new dock panel. Overrides the default renderer
      * and sets the (icon) kind
      *
      * @param options - The options for initializing the panel.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class IconRegistry ()
    extends typingsSlinky.atJupyterlabUiDashComponents.libIconMod.IconRegistry {
    def this(options: typingsSlinky.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry.IOptions) = this()
  }
  
  @js.native
  class TabBarSvg[T] protected ()
    extends typingsSlinky.atJupyterlabUiDashComponents.libIconMod.TabBarSvg[T] {
    /**
      * Construct a new tab bar. Sets the (icon) kind and overrides
      * the default renderer.
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  
  val IIconRegistry: Token[typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry] = js.native
  val defaultIconRegistry: typingsSlinky.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry = js.native
  def Button(props: IButtonProps with DOMAttributes[_]): Element = js.native
  def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def DefaultIconReact(props: INodeOptions with Anon_DivSpan): ReactElement = js.native
  def HTMLSelect(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IHTMLSelectProps */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def InputGroup(props: IInputGroupProps with DOMAttributes[_]): Element = js.native
  def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def combineClasses(classNames: js.UndefOr[String]*): String = js.native
  @js.native
  object DockPanelSvg extends js.Object {
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.atJupyterlabUiDashComponents.libIconMod.DockPanelSvg.Renderer {
      def this(kind: IconKindType) = this()
    }
    
  }
  
  @js.native
  object IconImports extends js.Object {
    val defaultIcons: js.Array[IModel] = js.native
  }
  
  /* static members */
  @js.native
  object IconRegistry extends js.Object {
    def iconClassName(name: String): String = js.native
  }
  
  @js.native
  object TabBarSvg extends js.Object {
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg.Renderer
    
    val defaultRenderer: typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
}

