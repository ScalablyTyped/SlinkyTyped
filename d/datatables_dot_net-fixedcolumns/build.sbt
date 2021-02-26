organization := "org.scalablytyped.slinky"
name := "datatables_dot_net-fixedcolumns"
version := "3.3-dt-20201105Z-6a799f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "datatables_dot_net" % "1.10-dt-20201002Z-cfaf30",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-7b4ce2",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-da3788",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
