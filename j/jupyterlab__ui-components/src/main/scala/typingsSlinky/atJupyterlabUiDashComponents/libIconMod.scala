package typingsSlinky.atJupyterlabUiDashComponents

import slinky.core.facade.ReactElement
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.IModel
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.INodeOptions
import typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.DockPanelSvg.IOptions
import typingsSlinky.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon", JSImport.Namespace)
@js.native
object libIconMod extends js.Object {
  @js.native
  class DockPanelSvg protected ()
    extends typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.DockPanelSvg {
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
    extends typingsSlinky.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry {
    def this(options: typingsSlinky.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry.IOptions) = this()
  }
  
  @js.native
  class TabBarSvg[T] protected ()
    extends typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg[T] {
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
  def DefaultIconReact(props: INodeOptions with Anon_DivSpan): ReactElement = js.native
  @js.native
  object DockPanelSvg extends js.Object {
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.DockPanelSvg.Renderer {
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

