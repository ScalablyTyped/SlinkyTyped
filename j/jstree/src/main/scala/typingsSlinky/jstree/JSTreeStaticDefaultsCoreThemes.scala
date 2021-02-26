package typingsSlinky.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStaticDefaultsCoreThemes extends StObject {
  
  /**
    * the location of all jstree themes - only used if `url` is set to `true`
    * @name $.jstree.defaults.core.themes.dir
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * a boolean indicating if connecting dots are shown
    * @name $.jstree.defaults.core.themes.dots
    */
  var dots: js.UndefOr[Boolean] = js.native
  
  /**
    * a boolean indicating if node ellipsis should be shown - this only works with a fixed with on the container
    * @name $.jstree.defaults.core.themes.ellipsis
    */
  var ellipsis: js.UndefOr[Boolean] = js.native
  
  /**
    * a boolean indicating if node icons are shown
    * @name $.jstree.defaults.core.themes.icons
    */
  var icons: js.UndefOr[Boolean] = js.native
  
  /**
    * the name of the theme to use (if left as `false` the default theme is used)
    * @name $.jstree.defaults.core.themes.name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * a boolean specifying if a reponsive version of the theme should kick in on smaller screens (if the theme supports it).
    * Defaults to `false`.
    * @name $.jstree.defaults.core.themes.responsive
    */
  var responsive: js.UndefOr[Boolean] = js.native
  
  /**
    * a boolean indicating if the tree background is striped
    * @name $.jstree.defaults.core.themes.stripes
    */
  var stripes: js.UndefOr[Boolean] = js.native
  
  /**
    * the URL of the theme's CSS file, leave this as `false` if you have manually included the theme CSS (recommended).
    * You can set this to `true` too which will try to autoload the theme.
    * @name $.jstree.defaults.core.themes.url
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * a string (or boolean `false`) specifying the theme variant to use (if the theme supports variants)
    * @name $.jstree.defaults.core.themes.variant
    */
  var variant: js.UndefOr[js.Any] = js.native
}
object JSTreeStaticDefaultsCoreThemes {
  
  @scala.inline
  def apply(): JSTreeStaticDefaultsCoreThemes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreThemes]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsCoreThemesMutableBuilder[Self <: JSTreeStaticDefaultsCoreThemes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    @scala.inline
    def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setIcons(value: Boolean): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setStripes(value: Boolean): Self = StObject.set(x, "stripes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripesUndefined: Self = StObject.set(x, "stripes", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVariant(value: js.Any): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
