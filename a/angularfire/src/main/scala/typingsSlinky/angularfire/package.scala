package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object angularfire {
  
  type AngularFireAuthService = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ /* firebase */ js.Any, 
    typingsSlinky.angularfire.AngularFireAuth
  ]
  
  type AngularFireService = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ /* firebase */ js.Any, 
    /* config */ js.UndefOr[js.Any], 
    typingsSlinky.angularfire.AngularFire
  ]
}
