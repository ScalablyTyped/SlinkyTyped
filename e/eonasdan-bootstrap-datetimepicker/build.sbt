organization := "org.scalablytyped.slinky"
name := "eonasdan-bootstrap-datetimepicker"
version := "v4.17.37-dt-20200515Z-2bf6d4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20200621Z-70c01d",
  "org.scalablytyped.slinky" %%% "moment" % "2.27.0-2827ec",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-c1933c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
