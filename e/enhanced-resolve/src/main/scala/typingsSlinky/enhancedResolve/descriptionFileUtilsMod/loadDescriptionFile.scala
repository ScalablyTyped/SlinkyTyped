package typingsSlinky.enhancedResolve.descriptionFileUtilsMod

import typingsSlinky.enhancedResolve.resolverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enhanced-resolve/lib/DescriptionFileUtils", "loadDescriptionFile")
@js.native
object loadDescriptionFile extends js.Object {
  
  def apply(
    resolver: ^,
    directory: String,
    filenames: js.Array[String],
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error | Null], 
      /* result */ js.UndefOr[LoadDescriptionFileResult], 
      _
    ]
  ): Unit = js.native
}
