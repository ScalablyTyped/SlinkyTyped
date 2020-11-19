package typingsSlinky.mysql.mod

import typingsSlinky.mysql.mysqlNumbers.`0x00`
import typingsSlinky.mysql.mysqlNumbers.`0x01`
import typingsSlinky.mysql.mysqlNumbers.`0x02`
import typingsSlinky.mysql.mysqlNumbers.`0x03`
import typingsSlinky.mysql.mysqlNumbers.`0x04`
import typingsSlinky.mysql.mysqlNumbers.`0x05`
import typingsSlinky.mysql.mysqlNumbers.`0x06`
import typingsSlinky.mysql.mysqlNumbers.`0x07`
import typingsSlinky.mysql.mysqlNumbers.`0x08`
import typingsSlinky.mysql.mysqlNumbers.`0x09`
import typingsSlinky.mysql.mysqlNumbers.`0x0a`
import typingsSlinky.mysql.mysqlNumbers.`0x0b`
import typingsSlinky.mysql.mysqlNumbers.`0x0c`
import typingsSlinky.mysql.mysqlNumbers.`0x0d`
import typingsSlinky.mysql.mysqlNumbers.`0x0e`
import typingsSlinky.mysql.mysqlNumbers.`0x0f`
import typingsSlinky.mysql.mysqlNumbers.`0x10`
import typingsSlinky.mysql.mysqlNumbers.`0x11`
import typingsSlinky.mysql.mysqlNumbers.`0x12`
import typingsSlinky.mysql.mysqlNumbers.`0x13`
import typingsSlinky.mysql.mysqlNumbers.`0xf5`
import typingsSlinky.mysql.mysqlNumbers.`0xf6`
import typingsSlinky.mysql.mysqlNumbers.`0xf7`
import typingsSlinky.mysql.mysqlNumbers.`0xf8`
import typingsSlinky.mysql.mysqlNumbers.`0xf9`
import typingsSlinky.mysql.mysqlNumbers.`0xfa`
import typingsSlinky.mysql.mysqlNumbers.`0xfb`
import typingsSlinky.mysql.mysqlNumbers.`0xfc`
import typingsSlinky.mysql.mysqlNumbers.`0xfd`
import typingsSlinky.mysql.mysqlNumbers.`0xfe`
import typingsSlinky.mysql.mysqlNumbers.`0xff`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mysql.mysqlNumbers.`0x00`
  - typingsSlinky.mysql.mysqlNumbers.`0x01`
  - typingsSlinky.mysql.mysqlNumbers.`0x02`
  - typingsSlinky.mysql.mysqlNumbers.`0x03`
  - typingsSlinky.mysql.mysqlNumbers.`0x04`
  - typingsSlinky.mysql.mysqlNumbers.`0x05`
  - typingsSlinky.mysql.mysqlNumbers.`0x06`
  - typingsSlinky.mysql.mysqlNumbers.`0x07`
  - typingsSlinky.mysql.mysqlNumbers.`0x08`
  - typingsSlinky.mysql.mysqlNumbers.`0x09`
  - typingsSlinky.mysql.mysqlNumbers.`0x0a`
  - typingsSlinky.mysql.mysqlNumbers.`0x0b`
  - typingsSlinky.mysql.mysqlNumbers.`0x0c`
  - typingsSlinky.mysql.mysqlNumbers.`0x0d`
  - typingsSlinky.mysql.mysqlNumbers.`0x0e`
  - typingsSlinky.mysql.mysqlNumbers.`0x0f`
  - typingsSlinky.mysql.mysqlNumbers.`0x10`
  - typingsSlinky.mysql.mysqlNumbers.`0x11`
  - typingsSlinky.mysql.mysqlNumbers.`0x12`
  - typingsSlinky.mysql.mysqlNumbers.`0x13`
  - typingsSlinky.mysql.mysqlNumbers.`0xf5`
  - typingsSlinky.mysql.mysqlNumbers.`0xf6`
  - typingsSlinky.mysql.mysqlNumbers.`0xf7`
  - typingsSlinky.mysql.mysqlNumbers.`0xf8`
  - typingsSlinky.mysql.mysqlNumbers.`0xf9`
  - typingsSlinky.mysql.mysqlNumbers.`0xfa`
  - typingsSlinky.mysql.mysqlNumbers.`0xfb`
  - typingsSlinky.mysql.mysqlNumbers.`0xfc`
  - typingsSlinky.mysql.mysqlNumbers.`0xfd`
  - typingsSlinky.mysql.mysqlNumbers.`0xfe`
  - typingsSlinky.mysql.mysqlNumbers.`0xff`
*/
trait Types extends js.Object
object Types {
  
   // aka BIT, 1-8 byte
  @scala.inline
  def BIT: `0x10` = 0x10.asInstanceOf[`0x10`]
  
   // aka BLOB, TEXT
  @scala.inline
  def BLOB: `0xfc` = 0xfc.asInstanceOf[`0xfc`]
  
   // aka DATE
  @scala.inline
  def DATE: `0x0a` = 0x0a.asInstanceOf[`0x0a`]
  
   // aka DATETIME
  @scala.inline
  def DATETIME: `0x0c` = 0x0c.asInstanceOf[`0x0c`]
  
   // aka DATETIME with fractional seconds
  @scala.inline
  def DATETIME2: `0x12` = 0x12.asInstanceOf[`0x12`]
  
   // aka DECIMAL (http://dev.mysql.com/doc/refman/5.0/en/precision-math-decimal-changes.html)
  @scala.inline
  def DECIMAL: `0x00` = 0x00.asInstanceOf[`0x00`]
  
   // aka DOUBLE, 8 bytes
  @scala.inline
  def DOUBLE: `0x05` = 0x05.asInstanceOf[`0x05`]
  
   // aka ENUM
  @scala.inline
  def ENUM: `0xf7` = 0xf7.asInstanceOf[`0xf7`]
  
   // aka FLOAT, 4-8 bytes
  @scala.inline
  def FLOAT: `0x04` = 0x04.asInstanceOf[`0x04`]
  
   // aka GEOMETRY
  @scala.inline
  def GEOMETRY: `0xff` = 0xff.asInstanceOf[`0xff`]
  
   // aka MEDIUMINT, 3 bytes
  @scala.inline
  def INT24: `0x09` = 0x09.asInstanceOf[`0x09`]
  
   // aka JSON
  @scala.inline
  def JSON: `0xf5` = 0xf5.asInstanceOf[`0xf5`]
  
   // aka INT, 4 bytes
  @scala.inline
  def LONG: `0x03` = 0x03.asInstanceOf[`0x03`]
  
   // aka BIGINT, 8 bytes
  @scala.inline
  def LONGLONG: `0x08` = 0x08.asInstanceOf[`0x08`]
  
   // aka LONGBLOG, LONGTEXT
  @scala.inline
  def LONG_BLOB: `0xfb` = 0xfb.asInstanceOf[`0xfb`]
  
   // aka MEDIUMBLOB, MEDIUMTEXT
  @scala.inline
  def MEDIUM_BLOB: `0xfa` = 0xfa.asInstanceOf[`0xfa`]
  
   // aka ?
  @scala.inline
  def NEWDATE: `0x0e` = 0x0e.asInstanceOf[`0x0e`]
  
   // aka DECIMAL
  @scala.inline
  def NEWDECIMAL: `0xf6` = 0xf6.asInstanceOf[`0xf6`]
  
   // NULL (used for prepared statements, I think)
  @scala.inline
  def NULL: `0x06` = 0x06.asInstanceOf[`0x06`]
  
   // aka SET
  @scala.inline
  def SET: `0xf8` = 0xf8.asInstanceOf[`0xf8`]
  
   // aka SMALLINT, 2 bytes
  @scala.inline
  def SHORT: `0x02` = 0x02.asInstanceOf[`0x02`]
  
   // aka CHAR, BINARY
  @scala.inline
  def STRING: `0xfe` = 0xfe.asInstanceOf[`0xfe`]
  
   // aka TIME
  @scala.inline
  def TIME: `0x0b` = 0x0b.asInstanceOf[`0x0b`]
  
   // aka TIME with fractional seconds
  @scala.inline
  def TIME2: `0x13` = 0x13.asInstanceOf[`0x13`]
  
   // aka TIMESTAMP
  @scala.inline
  def TIMESTAMP: `0x07` = 0x07.asInstanceOf[`0x07`]
  
   // aka TIMESTAMP with fractional seconds
  @scala.inline
  def TIMESTAMP2: `0x11` = 0x11.asInstanceOf[`0x11`]
  
   // aka TINYINT, 1 byte
  @scala.inline
  def TINY: `0x01` = 0x01.asInstanceOf[`0x01`]
  
   // aka TINYBLOB, TINYTEXT
  @scala.inline
  def TINY_BLOB: `0xf9` = 0xf9.asInstanceOf[`0xf9`]
  
   // aka VARCHAR (?)
  @scala.inline
  def VARCHAR: `0x0f` = 0x0f.asInstanceOf[`0x0f`]
  
   // aka VARCHAR, VARBINARY
  @scala.inline
  def VAR_STRING: `0xfd` = 0xfd.asInstanceOf[`0xfd`]
  
   // aka YEAR, 1 byte (don't ask)
  @scala.inline
  def YEAR: `0x0d` = 0x0d.asInstanceOf[`0x0d`]
}
