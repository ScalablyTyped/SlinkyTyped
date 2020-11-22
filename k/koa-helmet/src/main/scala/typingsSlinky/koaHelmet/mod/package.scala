package typingsSlinky.koaHelmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HelmetOptions = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof helmet * / any>>[0] */ js.Any
  
  type KoaHelmetContentSecurityPolicyDirectiveFunction = js.Function1[/* ctx */ typingsSlinky.koa.mod.Context, java.lang.String]
  
  type KoaHelmetCspDirectiveValue = java.lang.String | typingsSlinky.koaHelmet.mod.KoaHelmetContentSecurityPolicyDirectiveFunction
}
