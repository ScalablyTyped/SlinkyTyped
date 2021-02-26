package typingsSlinky.dynogels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Document = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type DynogelsItemCallback = js.Function2[/* err */ js.Error, /* data */ typingsSlinky.dynogels.mod.Item, scala.Unit]
  
  type QueryFilterChain = typingsSlinky.dynogels.mod.ExtendedChain[typingsSlinky.dynogels.mod.Query]
  
  type QueryWhereChain = typingsSlinky.dynogels.mod.BaseChain[typingsSlinky.dynogels.mod.Query]
  
  @scala.inline
  def Set(args: js.Any*): js.Any = typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Set")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def createTables(callback: js.Function1[/* err */ java.lang.String, scala.Unit]): scala.Unit = typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def createTables(
    options: org.scalablytyped.runtime.StringDictionary[typingsSlinky.dynogels.mod.CreateTablesOptions],
    callback: js.Function1[/* err */ java.lang.String, scala.Unit]
  ): scala.Unit = (typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def createTables(
    options: typingsSlinky.dynogels.mod.DynogelsGlobalOptions,
    callback: js.Function1[/* err */ java.lang.String, scala.Unit]
  ): scala.Unit = (typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def define(modelName: java.lang.String, config: typingsSlinky.dynogels.mod.ModelConfiguration): typingsSlinky.dynogels.mod.Model = (typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("define")(modelName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.dynogels.mod.Model]
  
  @scala.inline
  def dynamoDriver(dynamoDB: typingsSlinky.dynogels.mod.AWS.DynamoDB): typingsSlinky.dynogels.mod.AWS.DynamoDB = typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dynamoDriver")(dynamoDB.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.dynogels.mod.AWS.DynamoDB]
  
  @scala.inline
  def log: typingsSlinky.dynogels.mod.Log_ = typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[typingsSlinky.dynogels.mod.Log_]
  @scala.inline
  def log_=(x: typingsSlinky.dynogels.mod.Log_): scala.Unit = typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def reset(): scala.Unit = typingsSlinky.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[scala.Unit]
  
  type tableResolve = js.Function0[java.lang.String]
}
