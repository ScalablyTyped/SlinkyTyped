package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.builderUtil.fsMod.Filter
import typingsSlinky.fsExtra.mod.Stats
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appFileWalkerMod {
  
  @JSImport("app-builder-lib/out/util/AppFileWalker", "FileCopyHelper")
  @js.native
  abstract class FileCopyHelper protected () extends StObject {
    protected def this(
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any,
      filter: Null,
      packager: Packager
    ) = this()
    protected def this(
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any,
      filter: Filter,
      packager: Packager
    ) = this()
    
    val filter: Filter | Null = js.native
    
    /* protected */ def handleFile(file: String, parent: String, fileStat: Stats): (js.Promise[Stats | Null]) | Null = js.native
    
    var handleSymlink: js.Any = js.native
    
    val matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any = js.native
    
    val metadata: Map[String, Stats] = js.native
    
    val packager: Packager = js.native
  }
}
