organization := "org.scalablytyped.slinky"
name := "hapi__glue"
version := "6.1-dt-20190425Z-7e9404"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "7.4-dt-20190815Z-f0741b",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-3d808d",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "18.2-dt-20191105Z-8d6050",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "5.1-dt-20190404Z-74d8d6",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "16.0-dt-20200103Z-82bedc",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20190404Z-cdd8ce",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20190404Z-bce121",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-a961c4",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-d112bf",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        