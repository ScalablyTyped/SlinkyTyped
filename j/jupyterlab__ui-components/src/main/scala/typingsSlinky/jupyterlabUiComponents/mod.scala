package typingsSlinky.jupyterlabUiComponents

import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabUiComponents.blueprintMod.IButtonProps
import typingsSlinky.jupyterlabUiComponents.blueprintMod.IInputGroupProps
import typingsSlinky.jupyterlabUiComponents.interfacesMod.Icon.IModel
import typingsSlinky.jupyterlabUiComponents.styleIconMod.IconKindType
import typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.IOptions
import typingsSlinky.phosphorCoreutils.mod.Token
import typingsSlinky.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DockPanelSvg protected ()
    extends typingsSlinky.jupyterlabUiComponents.iconMod.DockPanelSvg {
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
    extends typingsSlinky.jupyterlabUiComponents.iconMod.IconRegistry {
    def this(options: typingsSlinky.jupyterlabUiComponents.iconregistryMod.IconRegistry.IOptions) = this()
  }
  
  @js.native
  class TabBarSvg[T] protected ()
    extends typingsSlinky.jupyterlabUiComponents.iconMod.TabBarSvg[T] {
    /**
      * Construct a new tab bar. Sets the (icon) kind and overrides
      * the default renderer.
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  
  val IIconRegistry: Token[typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry] = js.native
  val defaultIconRegistry: typingsSlinky.jupyterlabUiComponents.iconregistryMod.IconRegistry = js.native
  def Button(props: IButtonProps with DOMAttributes[_]): ReactElement = js.native
  def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with DOMAttributes[_]
  ): ReactElement = js.native
  def DefaultIconReact(props: INodeOptionstagspandiv): ReactElement = js.native
  def HTMLSelect(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IHTMLSelectProps */ js.Any) with DOMAttributes[_]
  ): ReactElement = js.native
  def InputGroup(props: IInputGroupProps with DOMAttributes[_]): ReactElement = js.native
  def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with DOMAttributes[_]
  ): ReactElement = js.native
  def combineClasses(classNames: js.UndefOr[String]*): String = js.native
  @js.native
  object DockPanelSvg extends js.Object {
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.iconMod.DockPanelSvg.Renderer {
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
      extends typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer
    
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
}

