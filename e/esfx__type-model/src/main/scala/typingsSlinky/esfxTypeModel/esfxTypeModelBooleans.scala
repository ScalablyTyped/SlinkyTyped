package typingsSlinky.esfxTypeModel

import typingsSlinky.esfxTypeModel.distMod.And
import typingsSlinky.esfxTypeModel.distMod.EveryRest
import typingsSlinky.esfxTypeModel.distMod.Falsey
import typingsSlinky.esfxTypeModel.distMod.IsAny
import typingsSlinky.esfxTypeModel.distMod.IsCallable
import typingsSlinky.esfxTypeModel.distMod.IsConstructable
import typingsSlinky.esfxTypeModel.distMod.IsNever
import typingsSlinky.esfxTypeModel.distMod.IsProperSubsetOf
import typingsSlinky.esfxTypeModel.distMod.IsUnion
import typingsSlinky.esfxTypeModel.distMod.IsUnknown
import typingsSlinky.esfxTypeModel.distMod.Not
import typingsSlinky.esfxTypeModel.distMod.OneRest
import typingsSlinky.esfxTypeModel.distMod.Or
import typingsSlinky.esfxTypeModel.distMod.Overlaps
import typingsSlinky.esfxTypeModel.distMod.Relatable
import typingsSlinky.esfxTypeModel.distMod.SomeRest
import typingsSlinky.esfxTypeModel.distMod._IsSubsetOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object esfxTypeModelBooleans {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.esfxTypeModel.distMod.XOr because Already inherited
  - typingsSlinky.esfxTypeModel.distMod.SameType because Already inherited
  - typingsSlinky.esfxTypeModel.distMod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `false`
    extends IsNever[js.Any]
       with And[js.Any, js.Any]
       with EveryRest[js.Any]
       with Falsey
       with IsAny[js.Any]
       with IsCallable[js.Any]
       with IsConstructable[js.Any]
       with IsProperSubsetOf[js.Any, js.Any]
       with IsUnion[js.Any]
       with IsUnknown[js.Any]
       with Not[js.Any]
       with OneRest[js.Any]
       with Or[js.Any, js.Any]
       with Overlaps[js.Any, js.Any]
       with Relatable[js.Any, js.Any]
       with _IsSubsetOf[js.Any, js.Any]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.esfxTypeModel.distMod.SameType because Already inherited
  - typingsSlinky.esfxTypeModel.distMod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `true`
    extends IsNever[js.Any]
       with And[js.Any, js.Any]
       with IsAny[js.Any]
       with IsCallable[js.Any]
       with IsConstructable[js.Any]
       with IsUnknown[js.Any]
       with Not[js.Any]
       with OneRest[js.Any]
       with Or[js.Any, js.Any]
       with Overlaps[js.Any, js.Any]
       with Relatable[js.Any, js.Any]
       with SomeRest[js.Any]
       with _IsSubsetOf[js.Any, js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

