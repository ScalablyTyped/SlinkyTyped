package typingsSlinky.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLoginLoginItemMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.`type`
  import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.form
  import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.updateActive
  import typingsSlinky.std.Omit

  type LoginItem = ReactComponentClass[LoginItemProps]
  type LoginItemType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemMap * / any ]: react.react.FC<ant-design-pro.ant-design-pro/lib/Login/LoginItem.WrappedLoginItemProps>}
    */ typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.LoginItemType with js.Any
  type WrappedLoginItemProps = Omit[LoginItemProps, form | `type` | updateActive]
}
