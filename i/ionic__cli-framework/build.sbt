organization := "org.scalablytyped.slinky"
name := "ionic__cli-framework"
version := "3.0.5-b98a3a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-0383e4",
  "org.scalablytyped.slinky" %%% "log-update" % "3.3.0-f577c4",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20190322Z-83bee2",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-1c762e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        