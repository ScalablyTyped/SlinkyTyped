organization := "org.scalablytyped.slinky"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-6672d6"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-061f1f",
  "org.scalablytyped.slinky" %%% "crypto-js" % "v3.1.8-dt-20200427Z-58c40e",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-78ba56",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-a6c5ac",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-696f50",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200427Z-fd06b1",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-90a4b2",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "16.0-dt-20200225Z-651f20",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-7b4869",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200225Z-1f7131",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-27b5fd",
  "org.scalablytyped.slinky" %%% "hapi__sntp" % "3.1-dt-20190425Z-63171d",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-b0f594",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20191217Z-282c0c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200331Z-154045")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
