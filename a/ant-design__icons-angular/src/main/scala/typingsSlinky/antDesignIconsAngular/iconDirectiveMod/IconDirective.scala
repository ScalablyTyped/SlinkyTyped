package typingsSlinky.antDesignIconsAngular.iconDirectiveMod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.OnChanges
import typingsSlinky.angularCore.mod.Renderer2
import typingsSlinky.antDesignIconsAngular.iconServiceMod.IconService
import typingsSlinky.antDesignIconsAngular.typesMod.IconDefinition
import typingsSlinky.antDesignIconsAngular.typesMod.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/icons-angular/component/icon.directive", "IconDirective")
@js.native
class IconDirective protected () extends OnChanges {
  def this(_iconService: IconService, _elementRef: ElementRef[_], _renderer: Renderer2) = this()
  
  /**
    * Render a new icon in the current element. Remove the icon when `type` is falsy.
    */
  /* protected */ def _changeIcon(): js.Promise[SVGElement | Null] = js.native
  
  /* protected */ def _clearSVGElement(): Unit = js.native
  
  var _elementRef: ElementRef[_] = js.native
  
  /* protected */ def _getSelfRenderMeta(): RenderMeta = js.native
  
  var _iconService: IconService = js.native
  
  /**
    * Parse a icon to the standard form, an `IconDefinition` or a string like 'account-book-fill` (with a theme suffixed).
    * If namespace is specified, ignore theme because it meaningless for users' icons.
    *
    * @param type
    * @param theme
    */
  /* protected */ def _parseIconType(`type`: String, theme: ThemeType): IconDefinition | String = js.native
  /* protected */ def _parseIconType(`type`: IconDefinition, theme: ThemeType): IconDefinition | String = js.native
  
  var _renderer: Renderer2 = js.native
  
  /* protected */ def _setSVGElement(svg: SVGElement): Unit = js.native
  
  var theme: ThemeType = js.native
  
  var twoToneColor: String = js.native
  
  var `type`: String | IconDefinition = js.native
}
