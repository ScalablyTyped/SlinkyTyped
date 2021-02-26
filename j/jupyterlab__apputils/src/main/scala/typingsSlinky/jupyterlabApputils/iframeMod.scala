package typingsSlinky.jupyterlabApputils

import typingsSlinky.jupyterlabApputils.iframeMod.IFrame.IOptions
import typingsSlinky.jupyterlabApputils.iframeMod.IFrame.ReferrerPolicy
import typingsSlinky.jupyterlabApputils.iframeMod.IFrame.SandboxExceptions
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeMod {
  
  @JSImport("@jupyterlab/apputils/lib/iframe", "IFrame")
  @js.native
  /**
    * Create a new IFrame widget.
    */
  class IFrame () extends Widget {
    def this(options: IOptions) = this()
    
    var _referrerPolicy: js.Any = js.native
    
    var _sandbox: js.Any = js.native
    
    /**
      * Referrer policy for the iframe.
      *
      * #### Notes
      * By default, `no-referrer` is chosen.
      *
      * For more information, see
      * https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy
      */
    def referrerPolicy: ReferrerPolicy = js.native
    def referrerPolicy_=(value: ReferrerPolicy): Unit = js.native
    
    /**
      * Exceptions to the sandboxing.
      *
      * #### Notes
      * By default, all sandboxing security policies are enabled.
      * This setting allows the user to selectively disable these
      * policies. This should be done with care, as it can
      * introduce security risks, and possibly allow malicious
      * sites to execute code in a JupyterLab session.
      *
      * For more information, see
      * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe
      */
    def sandbox: js.Array[SandboxExceptions] = js.native
    def sandbox_=(values: js.Array[SandboxExceptions]): Unit = js.native
    
    /**
      * The url of the IFrame.
      */
    def url: String = js.native
    def url_=(url: String): Unit = js.native
  }
  object IFrame {
    
    /**
      * Options for creating a new IFrame widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Referrer policy for the iframe.
        */
      var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
      
      /**
        * Exceptions for the iframe sandbox.
        */
      var sandbox: js.UndefOr[js.Array[SandboxExceptions]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
        
        @scala.inline
        def setSandbox(value: js.Array[SandboxExceptions]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
        
        @scala.inline
        def setSandboxVarargs(value: SandboxExceptions*): Self = StObject.set(x, "sandbox", js.Array(value :_*))
      }
    }
    
    /**
      * Referrer policy for the iframe.
      *
      * User documentation for the policies can be found here:
      * https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.origin
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url`
    */
    trait ReferrerPolicy extends StObject
    object ReferrerPolicy {
      
      @scala.inline
      def `no-referrer`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer` = "no-referrer".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer`]
      
      @scala.inline
      def `no-referrer-when-downgrade`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade`]
      
      @scala.inline
      def origin: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.origin = "origin".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.origin]
      
      @scala.inline
      def `origin-when-cross-origin`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin`]
      
      @scala.inline
      def `same-origin`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin` = "same-origin".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin`]
      
      @scala.inline
      def `strict-origin`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin` = "strict-origin".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin`]
      
      @scala.inline
      def `strict-origin-when-cross-origin`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin`]
      
      @scala.inline
      def `unsafe-url`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url`]
    }
    
    /**
      * Exceptions to the iframe sandboxing policies.
      * These are specified here:
      * https://www.w3.org/TR/2011/WD-html5-20110525/the-iframe-element.html#attr-iframe-sandbox
      *
      * More user-friendly documentation can be found here:
      * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe#sandbox
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation`
      - typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation`
    */
    trait SandboxExceptions extends StObject
    object SandboxExceptions {
      
      @scala.inline
      def `allow-forms`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms` = "allow-forms".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms`]
      
      @scala.inline
      def `allow-modals`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals` = "allow-modals".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals`]
      
      @scala.inline
      def `allow-orientation-lock`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock` = "allow-orientation-lock".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock`]
      
      @scala.inline
      def `allow-pointer-lock`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock` = "allow-pointer-lock".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock`]
      
      @scala.inline
      def `allow-popups`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups` = "allow-popups".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups`]
      
      @scala.inline
      def `allow-presentation`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation` = "allow-presentation".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation`]
      
      @scala.inline
      def `allow-same-origin`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin` = "allow-same-origin".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin`]
      
      @scala.inline
      def `allow-scripts`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts` = "allow-scripts".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts`]
      
      @scala.inline
      def `allow-storage-access-by-user-activation`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation` = "allow-storage-access-by-user-activation".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation`]
      
      @scala.inline
      def `allow-top-navigation`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation` = "allow-top-navigation".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation`]
      
      @scala.inline
      def `allow-top-navigation-by-user-activation`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation` = "allow-top-navigation-by-user-activation".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation`]
      
      @scala.inline
      def `popups-to-escape-sandbox`: typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox` = "popups-to-escape-sandbox".asInstanceOf[typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox`]
    }
  }
}
