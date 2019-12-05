package typingsSlinky.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsGetBreadcrumbPropsMod {
  import typingsSlinky.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.itemRender
  import typingsSlinky.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.routes
  import typingsSlinky.std.Extract
  import typingsSlinky.std.Pick

  type BreadcrumbListReturn = Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps */ js.Any, 
    Extract[String, routes | itemRender]
  ]
}
