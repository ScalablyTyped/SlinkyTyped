package typingsSlinky.fslightboxReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fslightboxReact.mod.FsLightboxProps
import typingsSlinky.fslightboxReact.mod.SourceType
import typingsSlinky.fslightboxReact.mod.VideoDimensions
import typingsSlinky.fslightboxReact.mod.VideoPoster
import typingsSlinky.fslightboxReact.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FslightboxReact {
  
  @scala.inline
  def apply(toggler: Boolean): Builder = {
    val __props = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FsLightboxProps]))
  }
  
  @JSImport("fslightbox-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def customSources(value: js.Array[ReactElement]): this.type = set("customSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customSourcesVarargs(value: ReactElement*): this.type = set("customSources", js.Array(value :_*))
    
    @scala.inline
    def disableLocalStorage(value: Boolean): this.type = set("disableLocalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadOnlyCurrentSource(value: Boolean): this.type = set("loadOnlyCurrentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxYoutubeVideoDimensions(value: VideoDimensions): this.type = set("maxYoutubeVideoDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onInit(value: () => Unit): this.type = set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def onOpen(value: () => Unit): this.type = set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def openOnMount(value: Boolean): this.type = set("openOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slide(value: Double): this.type = set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slideDistance(value: Double): this.type = set("slideDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def source(value: String): this.type = set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sourceIndex(value: Double): this.type = set("sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sources(value: js.Array[String]): this.type = set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sourcesVarargs(value: String*): this.type = set("sources", js.Array(value :_*))
    
    @scala.inline
    def `type`(value: SourceType): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeNull: this.type = set("type", null)
    
    @scala.inline
    def types(value: js.Array[SourceType]): this.type = set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typesVarargs(value: SourceType*): this.type = set("types", js.Array(value :_*))
    
    @scala.inline
    def videosPosters(value: js.Array[VideoPoster]): this.type = set("videosPosters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def videosPostersVarargs(value: VideoPoster*): this.type = set("videosPosters", js.Array(value :_*))
  }
  
  def withProps(p: FsLightboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
