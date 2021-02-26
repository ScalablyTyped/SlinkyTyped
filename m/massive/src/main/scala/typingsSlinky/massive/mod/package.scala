package typingsSlinky.massive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(connection: java.lang.String): js.Promise[typingsSlinky.massive.mod.Database] = typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  @scala.inline
  def apply(connection: java.lang.String, loaderConfig: js.UndefOr[scala.Nothing], driverConfig: js.Object): js.Promise[typingsSlinky.massive.mod.Database] = (typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  @scala.inline
  def apply(connection: java.lang.String, loaderConfig: typingsSlinky.massive.mod.Loader): js.Promise[typingsSlinky.massive.mod.Database] = (typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  @scala.inline
  def apply(
    connection: java.lang.String,
    loaderConfig: typingsSlinky.massive.mod.Loader,
    driverConfig: js.Object
  ): js.Promise[typingsSlinky.massive.mod.Database] = (typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  @scala.inline
  def apply(connection: typingsSlinky.massive.mod.ConnectionInfo): js.Promise[typingsSlinky.massive.mod.Database] = typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  @scala.inline
  def apply(
    connection: typingsSlinky.massive.mod.ConnectionInfo,
    loaderConfig: js.UndefOr[scala.Nothing],
    driverConfig: js.Object
  ): js.Promise[typingsSlinky.massive.mod.Database] = (typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  @scala.inline
  def apply(
    connection: typingsSlinky.massive.mod.ConnectionInfo,
    loaderConfig: typingsSlinky.massive.mod.Loader
  ): js.Promise[typingsSlinky.massive.mod.Database] = (typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  @scala.inline
  def apply(
    connection: typingsSlinky.massive.mod.ConnectionInfo,
    loaderConfig: typingsSlinky.massive.mod.Loader,
    driverConfig: js.Object
  ): js.Promise[typingsSlinky.massive.mod.Database] = (typingsSlinky.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.massive.mod.Database]]
  
  type AnyObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type QueryParamTypes = java.lang.String | scala.Double | js.Object
  
  type QueryParams = js.Array[typingsSlinky.massive.mod.QueryParamTypes] | typingsSlinky.massive.mod.QueryParamTypes
  
  type UUID = java.lang.String
}
