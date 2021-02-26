package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.anon.Post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicatorsMod {
  
  @JSImport("lodash-decorators/applicators", "Applicator")
  @js.native
  abstract class Applicator ()
    extends typingsSlinky.lodashDecorators.applicatorMod.Applicator
  
  @JSImport("lodash-decorators/applicators", "BindApplicator")
  @js.native
  class BindApplicator ()
    extends typingsSlinky.lodashDecorators.bindApplicatorMod.BindApplicator
  
  @JSImport("lodash-decorators/applicators", "ComposeApplicator")
  @js.native
  class ComposeApplicator ()
    extends typingsSlinky.lodashDecorators.composeApplicatorMod.ComposeApplicator {
    def this(_config: Post) = this()
  }
  
  @JSImport("lodash-decorators/applicators", "InvokeApplicator")
  @js.native
  class InvokeApplicator ()
    extends typingsSlinky.lodashDecorators.invokeApplicatorMod.InvokeApplicator
  
  @JSImport("lodash-decorators/applicators", "MemoizeApplicator")
  @js.native
  class MemoizeApplicator ()
    extends typingsSlinky.lodashDecorators.memoizeApplicatorMod.MemoizeApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialApplicator")
  @js.native
  class PartialApplicator ()
    extends typingsSlinky.lodashDecorators.partialApplicatorMod.PartialApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialValueApplicator")
  @js.native
  class PartialValueApplicator ()
    extends typingsSlinky.lodashDecorators.partialValueApplicatorMod.PartialValueApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialedApplicator")
  @js.native
  class PartialedApplicator ()
    extends typingsSlinky.lodashDecorators.partialedApplicatorMod.PartialedApplicator
  
  @JSImport("lodash-decorators/applicators", "PostValueApplicator")
  @js.native
  class PostValueApplicator ()
    extends typingsSlinky.lodashDecorators.postValueApplicatorMod.PostValueApplicator
  
  @JSImport("lodash-decorators/applicators", "PreValueApplicator")
  @js.native
  class PreValueApplicator ()
    extends typingsSlinky.lodashDecorators.preValueApplicatorMod.PreValueApplicator
  
  @JSImport("lodash-decorators/applicators", "WrapApplicator")
  @js.native
  class WrapApplicator ()
    extends typingsSlinky.lodashDecorators.wrapApplicatorMod.WrapApplicator
}
