package typingsSlinky.floraColossus

import typingsSlinky.floraColossus.depTypesMod.DepType
import typingsSlinky.floraColossus.depTypesMod.DepType.DEV
import typingsSlinky.floraColossus.depTypesMod.DepType.DEV_OPTIONAL
import typingsSlinky.floraColossus.depTypesMod.DepType.OPTIONAL
import typingsSlinky.floraColossus.depTypesMod.DepType.PROD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flora-colossus", "DepType")
  @js.native
  object DepType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.floraColossus.depTypesMod.DepType with Double] = js.native
    
    /* 1 */ val DEV: typingsSlinky.floraColossus.depTypesMod.DepType.DEV with Double = js.native
    
    /* 3 */ val DEV_OPTIONAL: typingsSlinky.floraColossus.depTypesMod.DepType.DEV_OPTIONAL with Double = js.native
    
    /* 2 */ val OPTIONAL: typingsSlinky.floraColossus.depTypesMod.DepType.OPTIONAL with Double = js.native
    
    /* 0 */ val PROD: typingsSlinky.floraColossus.depTypesMod.DepType.PROD with Double = js.native
    
    /* 4 */ val ROOT: typingsSlinky.floraColossus.depTypesMod.DepType.ROOT with Double = js.native
  }
  
  @JSImport("flora-colossus", "Walker")
  @js.native
  class Walker protected ()
    extends typingsSlinky.floraColossus.walkerMod.Walker {
    def this(modulePath: String) = this()
  }
  
  @JSImport("flora-colossus", "childDepType")
  @js.native
  def childDepType(parentType: DepType, childType: DepType): PROD | DEV | OPTIONAL | DEV_OPTIONAL = js.native
  
  @JSImport("flora-colossus", "depTypeGreater")
  @js.native
  def depTypeGreater(newType: DepType, existing: DepType): Boolean = js.native
}
