package typingsSlinky.expoAsset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/resolveAssetSource.web", JSImport.Namespace)
@js.native
object resolveAssetSourceWebMod extends js.Object {
  
  def default(source: js.Any): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedAssetSource */ js.Any
  ] = js.native
  
  val pickScale: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof AssetSourceResolver.pickScale */ js.Any = js.native
  
  def setCustomSourceTransformer(
    transformer: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AssetSourceResolver */ /* resolver */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedAssetSource */ _
    ]
  ): Unit = js.native
}
