package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.anon.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/applicators", JSImport.Namespace)
@js.native
object applicatorsMod extends js.Object {
  
  @js.native
  abstract class Applicator ()
    extends typingsSlinky.lodashDecorators.applicatorMod.Applicator
  
  @js.native
  class BindApplicator ()
    extends typingsSlinky.lodashDecorators.bindApplicatorMod.BindApplicator
  
  @js.native
  class ComposeApplicator ()
    extends typingsSlinky.lodashDecorators.composeApplicatorMod.ComposeApplicator {
    def this(_config: Post) = this()
  }
  
  @js.native
  class InvokeApplicator ()
    extends typingsSlinky.lodashDecorators.invokeApplicatorMod.InvokeApplicator
  
  @js.native
  class MemoizeApplicator ()
    extends typingsSlinky.lodashDecorators.memoizeApplicatorMod.MemoizeApplicator
  
  @js.native
  class PartialApplicator ()
    extends typingsSlinky.lodashDecorators.partialApplicatorMod.PartialApplicator
  
  @js.native
  class PartialValueApplicator ()
    extends typingsSlinky.lodashDecorators.partialValueApplicatorMod.PartialValueApplicator
  
  @js.native
  class PartialedApplicator ()
    extends typingsSlinky.lodashDecorators.partialedApplicatorMod.PartialedApplicator
  
  @js.native
  class PostValueApplicator ()
    extends typingsSlinky.lodashDecorators.postValueApplicatorMod.PostValueApplicator
  
  @js.native
  class PreValueApplicator ()
    extends typingsSlinky.lodashDecorators.preValueApplicatorMod.PreValueApplicator
  
  @js.native
  class WrapApplicator ()
    extends typingsSlinky.lodashDecorators.wrapApplicatorMod.WrapApplicator
}
