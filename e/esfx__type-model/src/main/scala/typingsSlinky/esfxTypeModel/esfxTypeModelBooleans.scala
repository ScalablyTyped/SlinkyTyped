package typingsSlinky.esfxTypeModel

import typingsSlinky.esfxTypeModel.distMod.And
import typingsSlinky.esfxTypeModel.distMod.IsAny
import typingsSlinky.esfxTypeModel.distMod.IsNever
import typingsSlinky.esfxTypeModel.distMod.IsUnknown
import typingsSlinky.esfxTypeModel.distMod.Not
import typingsSlinky.esfxTypeModel.distMod.Or
import typingsSlinky.esfxTypeModel.distMod.Overlaps
import typingsSlinky.esfxTypeModel.distMod.Relatable
import typingsSlinky.esfxTypeModel.distMod._Falsey
import typingsSlinky.esfxTypeModel.distMod._IsCallable
import typingsSlinky.esfxTypeModel.distMod._IsConstructable
import typingsSlinky.esfxTypeModel.distMod._IsProperSubsetOf
import typingsSlinky.esfxTypeModel.distMod._IsSubsetOf
import typingsSlinky.esfxTypeModel.distMod._OneRest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esfxTypeModelBooleans {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.esfxTypeModel.distMod.SameType because Already inherited
  - typingsSlinky.esfxTypeModel.distMod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `false`
    extends IsNever[js.Any]
       with And[js.Any, js.Any]
       with IsAny[js.Any]
       with IsUnknown[js.Any]
       with Not[js.Any]
       with Or[js.Any, js.Any]
       with Overlaps[js.Any, js.Any]
       with Relatable[js.Any, js.Any]
       with _Falsey
       with _IsCallable[js.Any]
       with _IsConstructable[js.Any]
       with _IsProperSubsetOf[js.Any, js.Any]
       with _IsSubsetOf[js.Any, js.Any]
       with _OneRest[js.Any]
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.esfxTypeModel.distMod.SameType because Already inherited
  - typingsSlinky.esfxTypeModel.distMod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `true`
    extends IsNever[js.Any]
       with And[js.Any, js.Any]
       with IsAny[js.Any]
       with IsUnknown[js.Any]
       with Not[js.Any]
       with Or[js.Any, js.Any]
       with Overlaps[js.Any, js.Any]
       with Relatable[js.Any, js.Any]
       with _IsCallable[js.Any]
       with _IsConstructable[js.Any]
       with _IsSubsetOf[js.Any, js.Any]
       with _OneRest[js.Any]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}
