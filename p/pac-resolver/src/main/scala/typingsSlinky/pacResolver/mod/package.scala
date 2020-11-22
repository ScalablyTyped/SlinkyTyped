package typingsSlinky.pacResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FindProxyForURL = typingsSlinky.std.ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createPacResolver */ js.Any
  ]
  
  type FindProxyForURLCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* result */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type GMT = typingsSlinky.pacResolver.pacResolverStrings.GMT
  
  type PacResolverOptions = typingsSlinky.degenerator.mod.CompileOptions
}
