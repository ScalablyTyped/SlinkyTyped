package typingsSlinky.agiledigitalMulePreview

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewContent")
  @js.native
  val MulePreviewContent: ReactComponentClass[MulePreviewContentProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffContent")
  @js.native
  val MulePreviewDiffContent: ReactComponentClass[MulePreviewDiffContentProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffUrl")
  @js.native
  val MulePreviewDiffUrl: ReactComponentClass[MulePreviewDiffUrlProps] = js.native
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewUrl")
  @js.native
  val MulePreviewUrl: ReactComponentClass[MulePreviewUrlProps] = js.native
  
  @js.native
  trait MulePreviewContentProps extends StObject {
    
    val contentRoot: String = js.native
    
    val contentString: String = js.native
  }
  object MulePreviewContentProps {
    
    @scala.inline
    def apply(contentRoot: String, contentString: String): MulePreviewContentProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentString = contentString.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewContentProps]
    }
    
    @scala.inline
    implicit class MulePreviewContentPropsMutableBuilder[Self <: MulePreviewContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentString(value: String): Self = StObject.set(x, "contentString", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MulePreviewDiffContentProps extends StObject {
    
    val contentRoot: String = js.native
    
    val contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  }
  object MulePreviewDiffContentProps {
    
    @scala.inline
    def apply(contentRoot: String, contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffContentProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewDiffContentProps]
    }
    
    @scala.inline
    implicit class MulePreviewDiffContentPropsMutableBuilder[Self <: MulePreviewDiffContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStrings(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = StObject.set(x, "contentStrings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MulePreviewDiffUrlProps extends StObject {
    
    val contentRoot: String = js.native
    
    val contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  }
  object MulePreviewDiffUrlProps {
    
    @scala.inline
    def apply(contentRoot: String, contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffUrlProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewDiffUrlProps]
    }
    
    @scala.inline
    implicit class MulePreviewDiffUrlPropsMutableBuilder[Self <: MulePreviewDiffUrlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrls(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = StObject.set(x, "contentUrls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MulePreviewUrlProps extends StObject {
    
    val contentRoot: String = js.native
    
    val contentUrl: String = js.native
  }
  object MulePreviewUrlProps {
    
    @scala.inline
    def apply(contentRoot: String, contentUrl: String): MulePreviewUrlProps = {
      val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulePreviewUrlProps]
    }
    
    @scala.inline
    implicit class MulePreviewUrlPropsMutableBuilder[Self <: MulePreviewUrlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRoot(value: String): Self = StObject.set(x, "contentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    }
  }
}
