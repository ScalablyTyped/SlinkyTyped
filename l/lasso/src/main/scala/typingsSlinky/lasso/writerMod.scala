package typingsSlinky.lasso

import typingsSlinky.lasso.dependenciesMod.Bundle
import typingsSlinky.lasso.lassoContextMod.default
import typingsSlinky.lasso.lassoMod.LassoConfig
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @js.native
  trait Writer extends EventEmitter {
    
    def apply(impl: js.Any): Writer = js.native
    
    def buildResourceCacheKey(cacheKey: String, lassoContext: default): String = js.native
    
    def checkBundleUpToDate(bundle: Bundle, lassoContext: default, callback: js.Any): js.Any = js.native
    
    def checkResourceUpToDate(path: String, lassoContext: default, callback: js.Any): js.Any = js.native
    
    var config: LassoConfig = js.native
    
    def getInPlaceUrlForBundle(bundle: Bundle, lassoContext: default): String = js.native
    
    def getInPlaceUrlForFile(path: String, lassoContext: default): String | Null = js.native
    
    def getLasso(): typingsSlinky.lasso.lassoMod.default = js.native
    
    var impl: js.Any = js.native
    
    var lasso: typingsSlinky.lasso.lassoMod.default = js.native
    
    def setLasso(lasso: typingsSlinky.lasso.lassoMod.default): Unit = js.native
    
    def writeBundle(bundle: Bundle, onBundleWrittenCallback: js.Any, lassoContext: default, callback: js.Any): js.Any = js.native
    
    def writeBundles(iteratorFunc: js.Any, onBundleWrittenCallback: js.Any, lassoContext: default, callback: js.Any): Unit = js.native
    
    def writeResource(path: String, lassoContext: default, callback: js.Any): js.Any = js.native
  }
}
