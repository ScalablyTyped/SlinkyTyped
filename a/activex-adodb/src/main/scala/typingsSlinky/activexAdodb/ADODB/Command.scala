package typingsSlinky.activexAdodb.ADODB

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  @JSName("ADODB.Command_typekey")
  var ADODBDotCommand_typekey: Command = js.native
  
  /**
    * Sets or returns a String value that contains a definition for a connection if the connection is closed, or a Variant containing the current Connection object if the connection is open. Default is a null object reference.
    */
  var ActiveConnection: String | Connection | Null = js.native
  
  def Cancel(): Unit = js.native
  
  var CommandStream: js.Any = js.native
  
  var CommandText: String = js.native
  
  var CommandTimeout: Double = js.native
  
  var CommandType: CommandTypeEnum = js.native
  
  /**
    * @param Name [Name='']
    * @param Type [Type=0]
    * @param Direction [Direction=1]
    * @param Size [Size=0]
    */
  def CreateParameter(): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Direction: js.UndefOr[scala.Nothing],
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Direction: js.UndefOr[scala.Nothing],
    Size: Double
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Direction: js.UndefOr[scala.Nothing],
    Size: Double,
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Direction: ParameterDirectionEnum
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Direction: ParameterDirectionEnum,
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Direction: ParameterDirectionEnum,
    Size: Double
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Direction: ParameterDirectionEnum,
    Size: Double,
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: js.UndefOr[scala.Nothing], Type: DataTypeEnum): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: DataTypeEnum,
    Direction: js.UndefOr[scala.Nothing],
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: DataTypeEnum,
    Direction: js.UndefOr[scala.Nothing],
    Size: Double
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: DataTypeEnum,
    Direction: js.UndefOr[scala.Nothing],
    Size: Double,
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: js.UndefOr[scala.Nothing], Type: DataTypeEnum, Direction: ParameterDirectionEnum): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: DataTypeEnum,
    Direction: ParameterDirectionEnum,
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: DataTypeEnum,
    Direction: ParameterDirectionEnum,
    Size: Double
  ): Parameter = js.native
  def CreateParameter(
    Name: js.UndefOr[scala.Nothing],
    Type: DataTypeEnum,
    Direction: ParameterDirectionEnum,
    Size: Double,
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String): Parameter = js.native
  def CreateParameter(
    Name: String,
    Type: js.UndefOr[scala.Nothing],
    Direction: js.UndefOr[scala.Nothing],
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String, Type: js.UndefOr[scala.Nothing], Direction: js.UndefOr[scala.Nothing], Size: Double): Parameter = js.native
  def CreateParameter(
    Name: String,
    Type: js.UndefOr[scala.Nothing],
    Direction: js.UndefOr[scala.Nothing],
    Size: Double,
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String, Type: js.UndefOr[scala.Nothing], Direction: ParameterDirectionEnum): Parameter = js.native
  def CreateParameter(
    Name: String,
    Type: js.UndefOr[scala.Nothing],
    Direction: ParameterDirectionEnum,
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String, Type: js.UndefOr[scala.Nothing], Direction: ParameterDirectionEnum, Size: Double): Parameter = js.native
  def CreateParameter(
    Name: String,
    Type: js.UndefOr[scala.Nothing],
    Direction: ParameterDirectionEnum,
    Size: Double,
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String, Type: DataTypeEnum): Parameter = js.native
  def CreateParameter(
    Name: String,
    Type: DataTypeEnum,
    Direction: js.UndefOr[scala.Nothing],
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String, Type: DataTypeEnum, Direction: js.UndefOr[scala.Nothing], Size: Double): Parameter = js.native
  def CreateParameter(
    Name: String,
    Type: DataTypeEnum,
    Direction: js.UndefOr[scala.Nothing],
    Size: Double,
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String, Type: DataTypeEnum, Direction: ParameterDirectionEnum): Parameter = js.native
  def CreateParameter(
    Name: String,
    Type: DataTypeEnum,
    Direction: ParameterDirectionEnum,
    Size: js.UndefOr[scala.Nothing],
    Value: js.Any
  ): Parameter = js.native
  def CreateParameter(Name: String, Type: DataTypeEnum, Direction: ParameterDirectionEnum, Size: Double): Parameter = js.native
  def CreateParameter(Name: String, Type: DataTypeEnum, Direction: ParameterDirectionEnum, Size: Double, Value: js.Any): Parameter = js.native
  
  var Dialect: String = js.native
  
  /**
    * @param Options [Options=-1]
    *
    * The **RecordsAffected** parameter is meant to take a variable to be modified by reference, which is not supported by Javascript
    *
    * The return value is as follows:
    *
    * * If the **adExecuteNoRecords** option is passed in, the method will return `null`. Otherwise:
    * * If the command specifies a row-returning query, then the method will return a new read-only, forward-only **Recordset** object with the results.
    * * If the command isn't intended to return results (e.g. an `UPDATE` statement), a closed empty **Recordset** will be returned.
    */
  def Execute(): Recordset | Null = js.native
  def Execute(RecordsAffected: js.UndefOr[scala.Nothing], Parameters: js.UndefOr[scala.Nothing], Options: Double): Recordset | Null = js.native
  def Execute(RecordsAffected: js.UndefOr[scala.Nothing], Parameters: SafeArray[_]): Recordset | Null = js.native
  def Execute(RecordsAffected: js.UndefOr[scala.Nothing], Parameters: SafeArray[_], Options: Double): Recordset | Null = js.native
  
  var Name: String = js.native
  
  var NamedParameters: Boolean = js.native
  
  def Parameters(Index: String): Parameter = js.native
  def Parameters(Index: Double): Parameter = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  
  var Prepared: Boolean = js.native
  
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  val State: ObjectStateEnum = js.native
}
