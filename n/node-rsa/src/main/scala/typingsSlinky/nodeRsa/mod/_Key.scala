package typingsSlinky.nodeRsa.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Key extends StObject
object _Key {
  
  @scala.inline
  def KeyComponentsPrivate(
    coeff: Buffer,
    d: Buffer,
    dmp1: Buffer,
    dmq1: Buffer,
    e: Buffer | Double,
    n: Buffer,
    p: Buffer,
    q: Buffer
  ): typingsSlinky.nodeRsa.mod.KeyComponentsPrivate = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dmp1 = dmp1.asInstanceOf[js.Any], dmq1 = dmq1.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeRsa.mod.KeyComponentsPrivate]
  }
  
  @scala.inline
  def KeyComponentsPublic(e: Buffer | Double, n: Buffer): typingsSlinky.nodeRsa.mod.KeyComponentsPublic = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeRsa.mod.KeyComponentsPublic]
  }
}
