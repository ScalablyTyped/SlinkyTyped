package typingsSlinky.lockfileLintApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Packages extends StObject {
    
    var packages: typingsSlinky.lockfileLintApi.mod.Packages = js.native
  }
  object Packages {
    
    @scala.inline
    def apply(packages: typingsSlinky.lockfileLintApi.mod.Packages): Packages = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packages]
    }
    
    @scala.inline
    implicit class PackagesMutableBuilder[Self <: Packages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPackages(value: typingsSlinky.lockfileLintApi.mod.Packages): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    }
  }
}
