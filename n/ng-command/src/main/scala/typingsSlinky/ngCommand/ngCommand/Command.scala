package typingsSlinky.ngCommand.ngCommand

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngCommand.Command")
@js.native
class Command protected () extends ICommand {
  def this(
    $scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ js.Any,
    execute: js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ _
      ]
  ) = this()
  def this(
    $scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ js.Any,
    execute: js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ _
      ],
    canExecute: js.Function0[Boolean]
  ) = this()
}

/* static members */
@JSGlobal("ngCommand.Command")
@js.native
object Command extends js.Object {
  var id: String = js.native
}

